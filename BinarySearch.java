//This is where the binary magic happens
public class BinarySearch {

	public static void main(String[] args) {
		
		//I made an array to use
		int[] findSomething = {0,2,4,5,7,9,12,35,76,80,90};
		
		//I pass the method an array and a number to find
		System.out.println(findUsingBinary(findSomething,76));
	}
	
	public static int findUsingBinary(int[] arr, int findThis)
	{
		//a boolean to track if the number is found
		boolean foundIndex = false;
		
		//this will become the index of the found number
		int indexOfNum = 0;
		
		//begin of area of search
		int min = arr[0];
		
		//middle of area of search
		int mid = arr[arr.length/2];
		
		//end of area of search
		int max = arr[arr.length-1];
		
		//while loop that runs as long as the number isnt found
		while(!foundIndex)
		{
			/*
			 * if the middle is 
			 * the number to be found then i made the
			 * varable into this value
			 * then I exit the while loop
			 * by making the boolean true
			 */
			if(mid == findThis)
			{
				indexOfNum = mid;
			
				foundIndex = true;
			
			}
			else if (mid>findThis)
			{
				/*
				 * if its greater then i shift down
				 */
				max = mid;
				
				mid = max/2;
			}
			else if (mid<findThis)
			{
				/*
				 * if its less then i shift up
				 */
				min = mid;
			
				mid = min+((max+min)/2);
			}
		}
		
		/*
		 * this takes the found number and finds the index of it using a 
		 * for loop
		 */
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(indexOfNum == arr[i])
			{
				indexOfNum = i;
			}
		}
		
		/*
		 * i return the index of the found number
		 */
		return indexOfNum;
		
	}

}
