/**
 * This is where I did the nonvoid methods assignment
 */
public class NonvoidMethodsIntroPractice {

	/**
	 * In this method I call the methods from below in print statements
	 * @param args
	 */
	public static void main(String[] args) {
		giveName();
		giveHairStyle();
		giveFavoriteFood();
		System.out.println(giveName()+"\n");
		System.out.println(giveHairStyle()+"\n");
		System.out.println(giveFavoriteFood()+"\n");
		getCircleStats(5);
		System.out.println(getCircleStats(5) + "\n");
		System.out.println("The sum of the two numbers is " + calculateSumOfInt(5,4) + ". Their difference is " + calculateDiffOfInt(5,4) + 
				". They have a product of " + calculateProductOfInt(5,4) + 
				", \n a quotient of " + calculateQuotientOfInt(5,4) + ", and number one modulo number two is " + calculateRemainderOfInt(5,4)
				+ ". \n");
		intValueCalculations(5,4);
		System.out.print(intValueCalculations(5,4) + "\n");
	}

	/**
	 * this method returns "My Name is Riley Malasig"
	 */
	public static String giveName()
	{
		return "My name is Riley Malasig";
	}
	
	/**
	 * this method returns a string "I have brown eyes"
	 * @return
	 */
	public static String giveEyeColor()
	{
		return "I have brown eyes";
	}
	
	/**
	 * this method returns a String that contains my hairstyle normally and during formal events
	 * @return
	 */
	public static String giveHairStyle()
	{
		return "I have a combed down hairstyle and a slick back during events";
	}
	
	
	/**
	 * this method prints a string containing my best friends
	 * @return
	 */
	public static String giveBestFriend()
	{
		return "My best friends are Kenna Aki-Marcos, Sophia Turla and Jaide";
	}
	
	/**
	 * this method returns a string containing my favorite food
	 * @return
	 */
	public static String giveFavoriteFood()
	{
		return "My favorite food is pork adobo and rice!!";
	}
	
	/**
	 * this method is passed a double which is the radius and calculates the diameter, circumference and the area of the circle
	 * and then it takes those calculations and returns them in a String
	 * @param radius
	 * @return
	 */
	public static String getCircleStats(double radius)
	{
		
		double diameter = 2*radius;
		double circumferenceOfCircle = 2 * Math.PI * radius;
		double areaOfCircle = Math.PI*(radius*radius); 
		return "The radius of this circle is " + radius + " and has a diameter of " + diameter + ". It has a circumference of " + circumferenceOfCircle +
				" and its area is " + areaOfCircle + "." ;
	}
	
	/**
	 * this method takes the two passed ints and calculates their sum then returns it as an int
	 * @param numOne
	 * @param numTwo
	 * @return
	 */
	public static int calculateSumOfInt(int numOne, int numTwo)
	{
		
		return numOne + numTwo;
	}
	
	/**
	 * this method takes the two passed ints and calculates their difference then returns it as an int
	 * @param numOne
	 * @param numTwo
	 * @return
	 */
	public static int calculateDiffOfInt(int numOne, int numTwo)
	{
		
		return numOne - numTwo;
	}
	
	/**
	 * this method takes the two passed ints and calculates their product then returns it as an int
	 * @param numOne
	 * @param numTwo
	 * @return
	 */
	public static int calculateProductOfInt(int numOne, int numTwo)
	{
		
		return numOne * numTwo;
	}
	
	/**
	 * this method takes the two passed ints and calculates their quotient then returns it as an int
	 * @param numOne
	 * @param numTwo
	 * @return
	 */
	public static int calculateQuotientOfInt(int numOne, int numTwo)
	{
		
		return numOne / numTwo;
	}
	
	/**
	 * this method takes the two passed ints and calculates their Remainder then returns it as an int
	 * @param numOne
	 * @param numTwo
	 * @return
	 */
	public static int calculateRemainderOfInt(int numOne, int numTwo)
	{
		
		return numOne % numTwo;
	}
	
	/**
	 * this method takes two passed ints and calculates their sum, difference, product, quotient, and modulo and returns them 
	 * in a String
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static String intValueCalculations (int num1, int num2)
	{
		int sumOfInt = num1+num2;
		int diffOfInt = num1-num2;
		int productOfInt = num1*num2;
		int quotientOfInt = num1/num2;
		int moduloOfNum1AndNum2 = num1%num2;
		return "The sum of the two numbers is " + sumOfInt + ". Their difference is " + diffOfInt + ". They have a product of " + productOfInt + 
				", \n a quotient of " + quotientOfInt + ", and number one modulo number two is " + moduloOfNum1AndNum2 + ". \n";
	}
}
