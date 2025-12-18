//imports scanner
import java.util.Scanner;


public class Wordle {
	
	  // Color codes as variables
    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String YELLOW = "\u001B[33m";
    static String RESET = "\u001B[0m";
	
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		
		//scaner input reader
		Scanner inputReader = new Scanner(System.in);
		

		startGame(inputReader);
		//generate a random word
		//check right letters (Blank, Yellow, Green)
		//each letter
		//5 tries
				
		//closes the scanner
		inputReader.close();	
				
	}
	// this is the method that allows me to take text into different colors
	  static void printColored(char text, String color) {
	        System.out.print(color + text + RESET);
	    }
			
	/**
	 * This method starts the game by assigning the winning word
	 */
	public static void startGame(Scanner inputReader)
	{
		
		 System.out.println("\nTake a guess at the 5 letter word");
		
		//assigns the random word
		String theWord = getWord();
				
		//pass theWord to a method that lets player pick their door
		checkRight(theWord,inputReader);
	}
	
	// this gets the word to be guessed
	public static String getWord()
	{
		int randNum = (int) (Math.random() *26);
		String[] wordList = {"apple", "grape", "melon","beans","above","actor","acute","admit","adopt","agree"
				,"baker","bases","basic","basis","beach","began","chase","cheap","check","chest","child","clean",
				"depth","dozen","drama","drank"};
		
		 String selectedWord = wordList[randNum];
		
			return selectedWord;

	}
	
	/**
	 * This method checks the correct placement of five characters in five tries 
	 * @param str
	 * @return
	 */
	 public static String checkRight(String str, Scanner inputReader)
	 {
		 //starts at 1
		 int count = 5;
		 
		 // runs until count is 6 or more
		 while (count>0)
		 {
			 //How many guesses left
			 System.out.println("\nYou have " + count + " guesses remaining.");
			 
			 //prompts user for input and stores it as a String 
			 String playerChoice = inputReader.nextLine();
 		
		 	 //returns invalid  if  player input is less or more than five and runs if the amount of characters is five
			 if (playerChoice.length() < 5 || playerChoice.length() > 5)
			 	{
				 	//returns Invalid Input
				 	System.out.print("Invalid Input, please try again");
			 	}	
			 else
			 {

				 //runs a loop until it goes through all five letters
				 for (int i = 0; i < str.length(); i++) 
				 {

					 //runs if the character matches the same index string character
					 if(playerChoice.charAt(i) == str.charAt(i))
					 {
						 
						 printColored(str.charAt(i), GREEN);
						 
					 }
					 //locates the character of the string and works only if it is within the word
					 else if (str.indexOf(playerChoice.charAt(i))>-1)
					 {
		
						 printColored(playerChoice.charAt(i), YELLOW);
					 }
			         //runs if both of the above booleans don't apply 
					 //and the player input character does not match the index string character   
					 else if (!(playerChoice.charAt(i) == str.charAt(i)))
					 {

		
						 printColored(playerChoice.charAt(i), RED);
					 }
		       
					 
				 }
				 
				 count --;
				 
				 //checks if its correct outside of the loop so that it doesnt get stuck in the loop
				 if (playerChoice.equals(str))
				    {
				        System.out.println("\nCongratulations!! You have guessed the word!!");
				        
				        // Exits the while loop so it dont get stuck
				        
				        break; 
				    }
	       
			 }  
			
		}
		// return str
		return str;
		 	 
    }
	           
		    
}
