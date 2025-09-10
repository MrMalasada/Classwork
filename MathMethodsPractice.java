
public class MathMethodsPractice {

	public static void main(String[] args) {
		double posDouble = 2.5;
		double negDouble = -2.5;
		int posInt = 5;
		int negInt = -5;
		
		/*
		 * This takes my positive and negative doubles and prints me their absolute values. 
		 * The Math.abs method is overloaded because I use it twice with two different data types
		 * It goes to the next line twice 
		 */
		System.out.println("The Absolute Value of posDouble is" + Math.abs(posDouble) + "; the absolute value of negDouble is " + Math.abs(negDouble) + 
				";\nthe absolute value of posInt is " + Math.abs(posInt) + "; and the absolute value of negInt is " + Math.abs(negInt) + ". \n");
		
		/*
		 * This takes my positive and negative ints and prints me the power of the pos to the neg and the neg to the pos
		 * It is not overloaded because it is is always using doubles
		 * It goes to the next line twice
		 */
		System.out.println("The calculation of  posInt ^ negInt is " + Math.pow(posInt, negInt) + "; negInt ^ posInt is " + Math.pow(negInt, posInt) + ".\n");
		
		/*
		 * This takes my pos and neg doubles and ints and prints me the square roots for each. 
		 * My negative double and int did not work because you cannot square a negative number
		 */
		System.out.println("The square root of posDouble is " + Math.sqrt(posDouble) + "; the square root of negDouble is " + Math.sqrt(negDouble) +
				"; the square root of posInt is " + Math.sqrt(posInt) + "; and the square root of negInt is " + Math.sqrt(negInt) + ". \n");
		
		/*
		 * Here I declare two doubles, f and x, and set f to a random number 0.0-1.0, then I use double x to use 11 and 20 to 
		 * set the lowest and highest values
		 * Then it casts x as an int then prints it out
		 * 
		 */
		
		/*
		 * Its complicated and kinda unorthadox, but it works by taking the random number and minusing it by one so that it gets the remainder
		 * then it takes that remainder and mulitplies it by the lowest or highest value, then it takes the regular random number and multiplies it by the
		 * other lowest or highest value. 
		 * when they are added together, the resulting value is between the lowest and highest number since you shrunk it by the two parts of 1.0
		 */
		double f = Math.random();
		double x = 11*(1.0 - f) + 20*f;
		
		System.out.print((int) x);
		
		
			
		// System.out.println((int)((10*f)+10)); Here is how we should done it lol
		}
		
	}


