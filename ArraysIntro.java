
public class ArraysIntroAssignment {

	public static void main(String[] args) {
		
		//empty array representing doubles
		double[] doubArr = {};

		//empty array representing ints
		int[] intArr = {};
		
		//empty array representing booleans
		boolean[] blnArr = {};
		
		//empty array representing Strings
		String[] strArr = {};
		
		//empty array representing Circles
		Circle[] circArr = {};
		
		//new array with the values given
		int[] newIntArr = {7, -12, 88, -88, 0, 5, 2000};		
		
		/*
		 * an array of 5 elements with the following names
		 * 
		 * the default value for ints is 0
		 * 
		 * the default value for doubles is 0.0
		 * 
		 * the default value for booleans is false
		 * 
		 * the default value for any reference data type is null
		 */
		String[] fruitsArr = new String[5];

		//changes the 2nd element to Bapple
		fruitsArr[1] = "Bapple";

		//changes the last element to Zanana using array length
		fruitsArr[fruitsArr.length - 1] = "Zanana";

		//prints the second element
		System.out.println(fruitsArr[1]);

		//prints each element of fruitsArr
		for (int i = 0; i < fruitsArr.length; i++) 
		{
		    System.out.println(fruitsArr[i]);
		}
		
	}

}
