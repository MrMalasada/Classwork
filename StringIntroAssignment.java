package CubeCalculator;
import java.util.Scanner;

/**
 * This is where I did my String Intro Assignment
 * above it I have imported a Scanner which I use in the following methods
 */

public class StringIntroAssignment {
	
	/*
	 * In my main method, I instantiate a Scanner object and a string object that is equal to the scanned input
	 * then I call the methods that I made bellow 
	 */
	
	public static void main(String[] args) {

	Scanner inputReader = new Scanner(System.in);
	
	String johnDoe = inputReader.nextLine();
	
	System.out.println(printSecondAndLastLetter(johnDoe) + "\n");
	
	System.out.println(findTheE(johnDoe)+ "\n");
	
	System.out.println(getLength(johnDoe)+ "\n");
	
	System.out.println(printFirstAndLastThree(johnDoe)+ "\n");
	
	inputReader.close();
}
	/*
	 * This method is passed a scanned input and I use the chatAt method to find the second and last letters then I return them as a string
	 */
	
	public static String printSecondAndLastLetter (String johnDoe) {
		
		return "The second letter is " + johnDoe.charAt(1) + " and the last letter is " +  johnDoe.charAt(johnDoe.length()-1);
	}
	
	/*
	 * this method is passed a scanned input, then I used the indexOf method to find the index of the first instance of a lowercase e, then I return it as a string
	 */
	
	public static String findTheE(String johnDoe) {
		
		int eLocation = johnDoe.indexOf("e");
		
		return "The letter e occurs first at " + eLocation;
	}
	
	/*
	 * This method is passed a scanned input and I use the .length() method to get the length of the input
	 * it is then returned as a string
	 */
	
	public static String getLength (String johnDoe) {
		
		return "The length of this string is " + johnDoe.length() + " letters long";
	}
	
	/*
	 * This method is passed a scanned input and I use the substring method to take its first three letters
	 * then in order to get the last three, I make three ints for each position using the length method minus one for each position down
	 * I take those and I put them into chars which find the character at the position that was calculated 
	 */
	
	public static String printFirstAndLastThree(String johnDoe) {
		
		String firstThree = new String (johnDoe.substring(0,3));
		
		int lastPos = johnDoe.length() - 1;
		
		int secToLastPos = johnDoe.length() - 2;
		
		int thirdToLastPos = johnDoe.length() - 3;
		
		char thirdToLast = johnDoe.charAt(thirdToLastPos);
		
		char secToLast = johnDoe.charAt(secToLastPos);
		
		char last = johnDoe.charAt(lastPos);
		
		return "The first three letters are " + firstThree + " and the last three are " + thirdToLast + secToLast + last;

	}
	
}
