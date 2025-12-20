package MakeYourChoiceGame;
/*
 * imports scanner
 */
import java.util.Scanner;

//this is the class where I do my make your choice project
public class MakeYourChoiceMain {
	
	/*
	 *  This is my main method which starts a string of 
	 *  methods calling methods that take you through the path of the
	 *  game
	 */
	public static void main(String[] args) {

	Scanner inputReader = new Scanner(System.in);

		// Starts the game
		startGame(inputReader);

		// closes my scanner to prevent my code from imploding
		inputReader.close();

	}

	
	/*
	 * this is the method that starts my game, it creates the player and 
	 * assigns its attributes using the player class
	 */
	public static void startGame(Scanner inputReader)
	{
		System.out.println("Hello! My name is Riley and I will be your host... \n"
				+         "\nWait, who are you?? \n"
				+           "\nPlease type your name:\n");

		String username = inputReader.nextLine();

		System.out.println("Hello " + username + " what is your grade level?");

		String userGrade = inputReader.nextLine();

		System.out.println("You are " + username + " and you are grade " + userGrade + " what is your favorite subject");

		String userFavSubj = inputReader.nextLine();
		
		System.out.println("What is your 2nd favorite subject");
		
		String userFavSubj2 = inputReader.nextLine();
		
		System.out.println("What is your 3rd favorite subject");
		
		String userFavSubj3 = inputReader.nextLine();
		
		System.out.println("What is your 4th favorite subject");
		
		String userFavSubj4 = inputReader.nextLine();

		Character player = new Character(username,userGrade,userFavSubj,userFavSubj2,userFavSubj3,userFavSubj4);

		startDay(inputReader, getChaos(inputReader), player);

	}

	//this uses a boolean from the input reader to decide if the user takes the chaos or non chaos path
	public static boolean getChaos(Scanner inputReader)
	{
		System.out.println("You would enjoy some chaos right? (true/false): ");
	    boolean result = inputReader.nextBoolean();
	    inputReader.nextLine(); 
	    return result;

	}
	
	/*
	 * This is the offical start to the game, the user has to decide if they get out of bed or not
	 * if they dont then they become late to class
	 */
	public static void startDay(Scanner inputReader, boolean chaos, Object player)
	{

		boolean upOnTime = false;

		if(!chaos)
		{
			System.out.println("BEEEP BEEEEP BEEEP..... BEEEP BEEEEP BEEEP....."
					+ "\nBEEEP BEEEEP BEEEP..... BEEEP BEEEEP BEEEP....."
					+ "\n \n Your alarm is going off, it's loud, very loud....");

			boolean wakeUp = getWakeUp(inputReader);

			int count = 1;
			while (count <= 4)
			{
				if (wakeUp && count <= 3)
				{
					System.out.println("you wake and get out of bed on time");

					upOnTime = true;


					getMorningRoutine(inputReader,upOnTime,player);

					break;

				}
				else if(!wakeUp && count == 4)
				{
					System.out.println("You wake up late, congrats");

					upOnTime = false;

					getMorningRoutine(inputReader,upOnTime,player);

					break;

				}
				else if (!wakeUp)
				{
					System.out.println("you go back to sleep for 5 more minutes");

					wakeUp = getWakeUp(inputReader);

				}

				count ++;

			}

		}
		else if (chaos)
		{
			System.out.println("RAAAAAAAAAAAAAHHHHHHHHHHHHH................ "
					+ "\nRAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHH..........."
					+ "\nRRRRRAAAAAAAAAAAAAAAHHHHHHHHHHHHHH...............");

			chaosMorning(inputReader, player);

		}
	}

	// this is for the previous method, it asks the user if they wake up on this loop or not
	public static boolean getWakeUp(Scanner inputReader)
	{
		    System.out.println("Do you wake up? (true/false): ");

		    Boolean result = inputReader.nextBoolean();

		    inputReader.nextLine();
		    return result;

	}

	/*
	 * This is just a choice for the user to decide what to do in the morning
	 * depending on what they choose, they will get different responses in reply
	 */
	public static void getMorningRoutine(Scanner inputReader, Boolean onTime, Object player)
	{
		System.out.println("Good morning " + ((Character) player).getUsername() + "!! How do you start your morning?"
				+ "\n A) Check your phone"
				+ "\n B) Go back to bed"
				+ "\n C) Get ready to leave"
				+ "\n D) Scream");

		String morningChoice;

		morningChoice = inputReader.nextLine();

		int count = 1;

		while (count > 0)
		{
			if (morningChoice.equals("A") || morningChoice.equals("a"))
			{
			System.out.println("You have an unread notification from someone");
			count --;
			}
			else if(morningChoice.equals("B") || morningChoice.equals("b"))
			{
			System.out.println("You go back to bed again for 5 more minutes. You're late");
			onTime = false;
			count --;
			}
			else if(morningChoice.equals("C") || morningChoice.equals("c"))
			{
				System.out.println("You get dressed, brush your teeth and get ready to leave");
				count --;
			}
			else if (morningChoice.equals("D") || morningChoice.equals("d"))
			{
				System.out.println("Your neighbors think you're weird");
				count --;
			}
			else
		        {
		            System.out.println("Invalid Choice, Please restart game");

		            count--;
		        }
		}

		getSchoolDay(inputReader, onTime, player);

	}
	
	/*
	 *  this is like the past method but for the chaos route
	 *  it also contains one of the ending, the coward ending
	 */
	public static void chaosMorning(Scanner inputReader, Object player)
	{
		System.out.println("\nYou wake up to screaming outside. Something is very wrong..."
				+ "\nYou hear sirens in the distance and people running.");
		
		System.out.println("\n\n=== BREAKING NEWS ===");
		
		System.out.println("Your school principal, Dr. Morrison, has been found dead at the school."
				+ "\n\nPolice are investigating it as a homicide."
				+ "\n\nStudents may come to school at their own desgression");
		
		System.out.println("\nDo you go to school? (true/false): ");
		
		boolean goToSchool = inputReader.nextBoolean();
		
		inputReader.nextLine();

		if (!goToSchool)
		{
			System.out.println("\nYou decide to stay home. Smart choice, probably."
					+ "\n\nYou feel like you're missing something important..."
					+ "\n\nGAME OVER: CONGRATS YOURE A COAWRD :D");
		
		}
		else {
			murderMystery(inputReader, player);
		}
	}

	/*
	 * This starts the murder mystery. Its nothing too complex.
	 * The user can make the decision to invesitage to ignore Baldie
	 * Each choice will resultin a different ending
	 */
	public static void murderMystery(Scanner inputReader, Object player)
	{
		System.out.println("\nYou arrive at school."
				+ "\n\nPolice officers are interviewing students and teachers.");
		
		System.out.println("\nYou notice Baldie, the vice principal, nervously pacing in the hallway.");
		System.out.println("He's holding a file folder marked 'CONFIDENTIAL'");
		System.out.println("\nDo you investigate him? (true/false): ");

		boolean investigate = inputReader.nextBoolean();
		inputReader.nextLine();

		if (investigate)
		{
			System.out.println("\nYou approach Baldie. His face is like a waterfall. \n'"
					+ ((Character) player).getUsername() + "! I didn't see you there.'"
							+ "\n\nYou see documents about embezzlement inside the folder."
							+ "\n\nBaldie grabs your arm. 'You didn't see anything, understand?'"
							+ "\n\nYou realize he's the killer. He was embezzling funds and Dr. Morrison found out."
							+ "\n\nWith that information, you break away from him and find the police officers");
		
			System.out.println("\n\nGAME OVER: CONGRATS YOURE A SNITCH");
		}
		else
		{
			System.out.println("\n\nYou decide you could careless about him."
					+ "\n\nIt is announced on the PA system that baldie was found to be the murderer");
			
			System.out.println("\n\nGAME OVER: CONGRATS YOU DID NOTHING");
		}
	}

	/*
	 * this is the "normal" path
	 * a regular school day with a pop quiz repeated three times with a for loop
	 */
	public static void getSchoolDay(Scanner inputReader, Boolean onTime, Object player)
	{
		System.out.println("\n\nSCHOOL TIME!!!!!");

		if (!onTime)
		{
			System.out.println("You arrive late to class. Your teacher gives you a disappointed look.");
		}
		else
		{
			System.out.println("You arrive to class right on time. Perfect!");
		}

		String[] classes = {((Character) player).getUserFavSubject(), ((Character) player).getUserFavSubject2(), ((Character) player).getUserFavSubject3(), 
				((Character) player).getUserFavSubject4()};
		
		for (int period = 0; period < classes.length; period++)
		{
			System.out.println("\nWELCOME TO PERIOD " + (period + 1) + ": " + classes[period] + "!!!!!");
			System.out.println("The teacher announces a pop quiz!");
			System.out.println("\nWhat do you do?");
			System.out.println("A) Take the quiz confidently");
			System.out.println("B) Try to cheat off your neighbor");
			System.out.println("C) Pretend to be sick");
			System.out.println("D) Ask to go to the bathroom");

			String periodChoice = inputReader.nextLine();

			if (periodChoice.equals("A") || periodChoice.equals("a"))
			{
				System.out.println("\nYou take the quiz and feel pretty good about it!");
			}
			else if(periodChoice.equals("B") || periodChoice.equals("b"))
			{
				System.out.println("\nYou try to peek at your neighbor's paper but the teacher catches you.");
				System.out.println("'Eyes on your own paper, " + ((Character) player).getUsername() + "!'");
			}
			else if(periodChoice.equals("C") || periodChoice.equals("c"))
			{
				System.out.println("\nYou put your head down and groan.");
				System.out.println("The teacher sends you to the nurse. You'll have to make up the quiz later.");
			}
			else if (periodChoice.equals("D") || periodChoice.equals("d"))
			{
				System.out.println("\nThe teacher sighs. 'Make it quick.'");
				System.out.println("You escape the quiz for now, but you'll still have to take it eventually.");
			}
		}

		System.out.println("\n\nGAME OVER: CONGRATS YOU LIVED A NORMAL DAY");
	}

}
