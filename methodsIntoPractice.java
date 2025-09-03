/**
 * this is the class where I did the Methods into practice assignment
 */
public class ClassWorkAugTwentyNine {
	/**
	 * this is the main method, it takes the methods made bellow it and calls them to make sure they work and print
	 * properly
	 * @param args
	 */
	
	public static void main(String[] args) {
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printMathStuffs(8,16);
		printCircleStats(14);

	}

	/**
	 * This prints "My Name Is Riley Malasig" and goes to the next line twice
	 */
	public static void stateName() {
	System.out.println("My Name Is Riley Malasig. \n");
	
}
	/**
	 * this prints out "I have Brown Eyes" and goes to the next line twice
	 */
	public static void stateEyeColor() {
	System.out.println("I have Brown Eyes. \n");
}
	
	/**
	 * this code prints out "My Hair Style is black stright hair that 
	 * is combed down in a causal setting and slicked back in formal settings"
	 * and goes to the next line twice
	 */
	public static void stateHairStyle() {
	System.out.println("My Hair Style is black stright hair that is combed down in a causal setting and slicked back in formal settings. \n");
}
	/**
	 * this code prints out "I don't have a single best friend. My best friends are the Galabanters: Kenna, Sophia and Xyrynn"
	 * and goes to the next line twice
	 */
	
	public static void stateBestFriend() {
		System.out.println("I don't have a single best friend. My best friends are the Galabanters: Kenna, Sophia and Xyrynn. \n");
	}
	/**
	 * This code prints out "My favorite food is pork adobo and rice"
	 * and goes to the next line twice
	 */
	
	public static void stateFavoriteFood() {
		System.out.println("My favorite food is pork adobo and rice. \n");
	}
	/**
	 * this method is passed a double which is the radius of a circle, it then takes that radius and calculates the
	 * diameter, circumference, and area of the circle. Then it takes the calculations and prints them in a sentence then goes to the next line twice
	 * @param radius
	 */
	
	public static void printCircleStats(double radius) {
		final double pi = 3.14;
		double diameter = 2 * radius;
		double circumferenceOfCircle = 2 * pi * radius;
		double areaOfCircle = pi*(radius*radius); 
	System.out.println("This circle has a radius of " + radius + ", and a diameter of " + diameter + ", its circumference is \n" + circumferenceOfCircle + 
			", and it has an area of " + areaOfCircle + ". \n");
	
	}
	/**
	 * this method is passed two integers, then calculates the sum, difference, product, quotient, and remainder of num1 modulo num2. It then prints the calculations 
	 * in a sentence and goes to the next line twice
	 * @param num1
	 * @param num2
	 */
	
	public static void printMathStuffs(int num1, int num2) {
		int sumOfInt = num1+num2;
		int diffOfInt = num1-num2;
		int productOfInt = num1*num2;
		int quotientOfInt = num1/num2;
		int moduloOfNum1AndNum2 = num1%num2;
		System.out.println("The sum of the two numbers is " + sumOfInt + ". Thier difference is " + diffOfInt + ". They have a product of " + productOfInt + 
				", \n a quotient of " + quotientOfInt + ", and number one modulo number two is " + moduloOfNum1AndNum2 + ". \n");
	}
}
