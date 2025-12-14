package MakeYourChoiceGame;
import java.util.Scanner; 

public class MakeYourChoiceMain {

	public static void main(String[] args) {

	Scanner inputReader = new Scanner(System.in);
		

		startGame(inputReader);
		
		
		
		inputReader.close();	
		
		
		
	}
	
	public static void startGame(Scanner inputReader)
	{
		System.out.println("Hello! My name is Riley and I will be your host..."
				+         "\nWait, who are you?? \n"
				+           "Please type your name:");
		
		String username = inputReader.nextLine();
		
		System.out.println("Hello " + username + " what is your grade level?");
		
		String userGrade = inputReader.nextLine();
		
		System.out.println("You are " + username + " and you are grade " + userGrade + " what is your favorite subject");
		
		String userFavSubj = inputReader.nextLine();
		
		Character player = new Character(username,userGrade,userFavSubj);
		
		startDay(inputReader, getChaos(inputReader)); 
		
	}
	
	public static boolean getChaos(Scanner inputReader)
	{
		    System.out.println("You would enjoy some chaos right? (true/false): ");
		    return inputReader.nextBoolean();
		
	}
	
	public static void startDay(Scanner inputReader, boolean chaos)
	{
		
		boolean upOnTime = false;
		
		if(!chaos)
		{	
			System.out.println("BEEEP BEEEEP BEEEP..... BEEEP BEEEEP BEEEP....."
					+ "\nBEEEP BEEEEP BEEEP..... BEEEP BEEEEP BEEEP....."
					+ "\n \n Your alarm is going off, it's loud, very loud...."
					+ "\n \n Do you wake up??");
			
			boolean wakeUp = getWakeUp(inputReader);
			
			int count = 1;
			while (count <= 4)
			{
				if (wakeUp && count <= 3)
				{
					System.out.println("you wake and get out of bed on time");
					
					upOnTime = true;
					
					getMorningRoutine(inputReader,upOnTime);
					
				}
				else if(!wakeUp && count == 4)
				{
					System.out.println("You wake up late, congrats");
					
					upOnTime = false;
					
					getMorningRoutine(inputReader,upOnTime);
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
			
		}
	}
	
	public static boolean getWakeUp(Scanner inputReader)
	{
		    System.out.println("Do you wake up? (true/false): ");
		    return inputReader.nextBoolean();
		
	}
	
	public static void getMorningRoutine(Scanner inputReader, Boolean onTime)
	{
		System.out.println("Good morning!!");
	}
	
}
	


