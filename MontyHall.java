package montyHallProject;

import java.util.Scanner;

public class MontyHall {

	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		startGame();
		
		
		inputReader.close();
		
	}
	
	public static void startGame() {
		
		System.out.println("\nBefore you are three doors, one of which contains your prize. Please select door one, two, or three.\n");
		
		System.out.println("Please use numberical values when selecting doors \n");
		
		int winDoorNum = (int) (Math.random() * 3) + 1;
		
		getPlayerChoice(winDoorNum);
		
	}
	
	public static void getPlayerChoice(int winDoor) {
		
		int firstChosenDoor = inputReader.nextInt();
	 
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
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
				
				
			}
			else {
				revealDoor = 3;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
				
			}	
		}
		else if ((vicDoor == 1) && (playerChoice == 2)) {
			int oneOrThree = (int) (Math.random() * 2) + 1;
			
			if (oneOrThree == 1) {
				
				revealDoor = 1;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);	
			}
			else {
				revealDoor = 3;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
			}	
		}
		else if ((vicDoor == 1) && (playerChoice == 3)) {
			
			int oneOrTwo = (int) (Math.random() * 2) + 1;
			
			if (oneOrTwo == 1) {
				
				revealDoor = 1;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);	
			}
			else {
				revealDoor = 2;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
			}	
			
			
		}
		
		
		if ((vicDoor == 2) && (playerChoice == 1)) {
			int twoOrThree = (int) (Math.random() * 2) + 1;
			
			if(twoOrThree == 1) {
				revealDoor = 2;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
				
				
			}
			else {
				revealDoor = 3;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
				
			}	
		}
		else if ((vicDoor == 2) && (playerChoice == 2)) {
			int oneOrThree = (int) (Math.random() * 2) + 1;
			
			if (oneOrThree == 1) {
				
				revealDoor = 1;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);	
			}
			else {
				revealDoor = 3;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
			}	
		}
		else if ((vicDoor == 2) && (playerChoice == 3)) {
			
			int oneOrTwo = (int) (Math.random() * 2) + 1;
			
			if (oneOrTwo == 1) {
				
				revealDoor = 1;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);	
			}
			else {
				revealDoor = 2;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
			}	
			
			
		}
		
		if ((vicDoor == 3) && (playerChoice == 1)) {
			int twoOrThree = (int) (Math.random() * 2) + 1;
			
			if(twoOrThree == 1) {
				revealDoor = 2;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
				
				
			}
			else {
				revealDoor = 3;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
				
			}	
		}
		else if ((vicDoor == 3) && (playerChoice == 2)) {
			int oneOrThree = (int) (Math.random() * 2) + 1;
			
			if (oneOrThree == 1) {
				
				revealDoor = 1;
				
				switchDoor = 3;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);	
			}
			else {
				revealDoor = 3;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
			}	
		}
		else if ((vicDoor == 3) && (playerChoice == 3)) {
			
			int oneOrTwo = (int) (Math.random() * 2) + 1;
			
			if (oneOrTwo == 1) {
				
				revealDoor = 1;
				
				switchDoor = 2;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);	
			}
			else {
				revealDoor = 2;
				
				switchDoor = 1;
				
				System.out.println("I reveal to you that door " + revealDoor + " does not have the prize. \n"
						+ "Would you like to keep your current selection or switch to door " + switchDoor);
			}	
			
			
		}
	}
		
		
	public static void getSwitchChoice(int playerChoice, int vicDoor) {
		
		
		
	}
		
	
}
	

