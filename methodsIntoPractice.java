
public class ClassWorkAugTwentyNine {

	public static void main(String[] args) {
		stateName();
		stateEyeColor();
		stateHairStyle();
		stateBestFriend();
		stateFavoriteFood();
		printMathStuffs(8,16);
		printCircleStats(14);

	}

	/**
	 * This prints "My Name Is Riley Malasig" and goes to the next line
	 */
	public static void stateName() {
	System.out.println("My Name Is Riley Malasig");
	
}
	/**
	 * this prints out "I have Brown Eyes" and goes to the next line
	 */
	public static void stateEyeColor() {
	System.out.println("I have Brown Eyes");
}
	
	/**
	 * this code prints out "My Hair Style is black stright hair that 
	 * is combed down in a causal setting and slicked back in formal settings"
	 * and goes to the next line
	 */
	public static void stateHairStyle() {
	System.out.println("My Hair Style is black stright hair that is combed down in a causal setting and slicked back in formal settings");
}
	/**
	 * this code prints out "I don't have a single best friend. My best friends are the Galabanters: Kenna, Sophia and Xyrynn"
	 * and goes to the next line
	 */
	
	public static void stateBestFriend() {
		System.out.println("I don't have a single best friend. My best friends are the Galabanters: Kenna, Sophia and Xyrynn");
	}
	/**
	 * This code prints out "My favorite food is pork adobo and rice"
	 * and goes to the next line
	 */
	
	public static void stateFavoriteFood() {
		System.out.println("My favorite food is pork adobo and rice");
	}
	
	public static void printCircleStats(double radius) {
		final double pi = 3.14;
		double diameter = 2 * radius;
		double circumferenceOfCircle = 2 * pi * radius;
		double areaOfCircle = pi*(radius*radius); 
	System.out.println("This circle has a radius of " + radius + ", and a diameter of " + diameter + ", its circumference is \n" + circumferenceOfCircle + 
			", and it has an area of " + areaOfCircle + ".");
	
	}
	/**
	 * this method is passed two integers, then calculates the sum, difference, product, quotient, and remainder of num1 modulo num2
	 * @param num1
	 * @param num2
	 */
	
	public static void printMathStuffs(int num1, int num2) {
	System.out.println(num1 + num2);
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	System.out.println(num1%num2);
	}
}
