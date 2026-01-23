
public class SearchingArraysIntro {

	public static void main(String[] args) {

	//testing array with a bunch of ints in it	
	int[] possible4 = {3,5,7,8,1,4,3,4,4,8,5,3,2};

	//printing my result for checkFor4
	System.out.println(checkFor4(possible4));
	
	//printing my result for countFor4
	System.out.println(countFor4(possible4));
	
	//printing my result for checkForfour4
	System.out.println(checkForFour4(possible4));
	
	}

	//the method where i complete checkFor4
	public static boolean checkFor4(int[] maybe4)
	{
		//boolean to return
		boolean thereIs4 = false;
		
		/*
		 * this traverses the array, changing to boolean
		 * for each element if it equals 4
		 */
		for (int i = 0 ; i<maybe4.length ; i++)
		{
			if(maybe4[i] == 4)
			{
				thereIs4 = true;
			}
		}
		
		//I return the final boolean
		return thereIs4;
	}
	
	//this is the method in which i complete countFor4
	public static int countFor4(int[] maybe4)
	{
		//int to keep track of the number of 4s
		int numOf4 = 0;
		
		/*
		 * this traverses the array and checks each element 
		 * if it equals 4 and adds 1 to the numOf4
		 * int if it does equal 4
		 */
		for (int i = 0 ; i<maybe4.length ; i++)
		{
			if(maybe4[i] == 4)
			{
				numOf4 ++;
			}
		}
		
		//I return the final value of numOf4
		return numOf4;
	}
	
	//this is the method in which i complete checkForFour4
	public static boolean checkForFour4(int[] maybe4)
	{
		//boolean to keep track if there is exctly four 4s
		boolean four4 = false;
		
		// int to keep track of the number of 4s
		int num4 = 0;
		
		/*
		 * this traverses the array searching for four
		 * and if it finds a 4, it adds one to the counter
		 */
		for (int i = 0 ; i<maybe4.length ; i++)
		{
			if(maybe4[i] == 4)
			{
				num4 ++;
			}
		}	
		
		/*
		 * i check if= num4 is exactly 4 and
		 * if it is i change four4 to be true
		 */
		if(num4 == 4)
		{
			four4 = true;
		}
		
		// i return the final value of four4
		return four4;

	}
	
}
