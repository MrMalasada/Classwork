package montyHallProject;

import java.util.Scanner;

public class MontyHall {

	//I make a scanner object to get the input of the user
	
	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// this starts the game which triggers a seiriees of methods that trigger eachother throughtout the game
		startGame();
		
		
		inputReader.close();
		
	}
	
	/*
	 * startGame tells the user to select 1 of 3 doors and sets a winning door using Math.random
	 */
	
	public static void startGame() {
		
		System.out.println("\nBefore you are three doors, one of which contains your prize. Please select door one, two, or three.\n");
		
		System.out.println("Please use numberical values when selecting doors \n");
		
		int winDoorNum = (int) (Math.random() * 3) + 1;
		
		getPlayerChoice(winDoorNum);
		
	}
	
	/*
	 * getPlayerChoice uses the inputReader to get a player selection and based on the seleciton
	 * it goes through multiple if statements that read the input and winnin door values
	 * to decide which door should be revealed and which door to switch to if the player decides to switch
	 */
	
	public static void getPlayerChoice(int winDoor) {
		
		int firstChosenDoor = inputReader.nextInt();
		
		 inputReader.nextLine();
	 
		if (firstChosenDoor == 1) {
			System.out.println("You have chosen door " + firstChosenDoor);
			
			getRevealDoor(winDoor,firstChosenDoor);
		}
		else if (firstChosenDoor == 2) {
			System.out.println("You have chosen door " + firstChosenDoor);
			
			getRevealDoor(winDoor,firstChosenDoor);
		}
		else if (firstChosenDoor == 3) {
			System.out.println("You have chosen door " + firstChosenDoor + "\n");
			
			getRevealDoor(winDoor,firstChosenDoor);
		}
		else {
			System.out.println("\nYou have chosen an invalid door, please choose again \n");
			
			startGame();
		}
	}
	
	
	public static void getRevealDoor(int vicDoor, int playerChoice) {
		int revealDoor;
		int switchDoor;
		
		
		
		if ((vicDoor == 1) && (playerChoice == 1)) {
			int twoOrThree = (int) (Math.random() * 2) + 1;
			
			if(twoOrThree == 1) {
				revealDoor = 2;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
				
				
				
			}
			else {
				revealDoor = 3;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
				
			}	
		}
		else if ((vicDoor == 1) && (playerChoice == 2)) {
		
			
			revealDoor = 3;
			
			switchDoor = 1;
			
			System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
					+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");	
			
			System.out.println("Type 'keep' or 'switch'");
			
			String secChoice = inputReader.nextLine();
			
			getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
			
		}
		else if ((vicDoor == 1) && (playerChoice == 3)) {
				
				revealDoor = 2;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");	
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
		
		}
		
		
		if ((vicDoor == 2) && (playerChoice == 1)) {
		
				revealDoor = 3;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
		
		}
		else if ((vicDoor == 2) && (playerChoice == 2)) {
			int oneOrThree = (int) (Math.random() * 2) + 1;
			
			if (oneOrThree == 1) {
				
				revealDoor = 1;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");	
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
			}
			else {
				revealDoor = 3;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
			}	
		}
		else if ((vicDoor == 2) && (playerChoice == 3)) {
	
				
				revealDoor = 1;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");	
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
			
		}
		
		if ((vicDoor == 3) && (playerChoice == 1)) {

				revealDoor = 2;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
				
		}
		else if ((vicDoor == 3) && (playerChoice == 2)) {

				
				revealDoor = 1;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");	
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);

		}
		else if ((vicDoor == 3) && (playerChoice == 3)) {
			
			int oneOrTwo = (int) (Math.random() * 2) + 1;
			
			if (oneOrTwo == 1) {
				
				revealDoor = 1;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");	
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
			}
			else {
				revealDoor = 2;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor + "\n");
				
				System.out.println("Type 'keep' or 'switch'");
				
				String secChoice = inputReader.nextLine();
				
				getSwitchChoice(playerChoice, vicDoor, switchDoor, secChoice);
			}	
			
			
		}
	}
	
	/*
	 * this takes information from the previous method and tells the player the result of their decision to keep or switch
	 */
	
	public static void getSwitchChoice(int playerChoice, int vicDoor, int secOption, String keepOrSwitch) {

	    if (keepOrSwitch.equalsIgnoreCase("keep")) {
	        if (playerChoice == vicDoor) {
	            System.out.println("You chose to keep door " + playerChoice + ". Which is the winning door! You have won!" + "\n");
	        } else {
	            System.out.println("You chose to keep door " + playerChoice + ". Which is not the winning door! You have lost!" + "\n");
	            
	        }
	    } 
	    
	    else if (keepOrSwitch.equalsIgnoreCase("switch")) {
	        playerChoice = secOption;
	        if (playerChoice == vicDoor) {
	            System.out.println("You switched to door " + playerChoice + ". Which is the winning door! You have won!" + "\n");
	        } else {
	            System.out.println("You switched to door " + playerChoice + ". Which is not the winning door! You have lost!" + "\n");
	        }
	    } 
	    
	    else {
	        System.out.println("Invalid input. Please type 'keep' or 'switch'." + "\n");
	        String newChoice = inputReader.nextLine();
	        getSwitchChoice(playerChoice, vicDoor, secOption, newChoice);
	    }
	
	    
}
		
}



