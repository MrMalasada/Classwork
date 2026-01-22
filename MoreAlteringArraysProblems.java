
public class MoreAlteringArraysProblems {

	public static void main(String[] args) {
		// a starter Arr for noNeg
		double[] baseArr = {7.0,-6.4,3.9,-9.2,-1.8,0.0};
		
		//a starter Arr for dropLowest
		int[] initialArr = {1,6,3,9,5};
		
		/*
		 * i put the new array made from 
		 * noNegatives into a seperate array outside of the
		 * method so i can access it
		 */
		double[] resultsNoNegArr = noNegatives(baseArr); 
		
		/*
		 * i put the new array made from 
		 * dropLowest into a seperate array outside of the
		 * method so i can access it
		 */
		int[] resultsDropLow = dropLowest(initialArr);
		
		/*
		 * this traverses the array, printing each element
		 * for the noNegatives Array
		 */
		for(int i = 0 ; i<resultsNoNegArr.length ; i++)
		{
			System.out.print(resultsNoNegArr[i] + "\t");
			
		}
		
		// indent for legibility
		System.out.print("\n");
		
		/*
		 * this traverses the array, printing each element
		 * for the dropLowest Array
		 */
		for(int i = 0 ; i<resultsDropLow.length ; i++)
		{
			System.out.print(resultsDropLow[i] + "\t");
			
		}

	}
	
	public static double[] noNegatives(double [] tempDoubleArr)
	{
		//I make a copy of the passed array
		double[] copyArr = new double[tempDoubleArr.length];
		
		//this assigns they new array the same elements as the original
		for(int i = 0 ; i<tempDoubleArr.length ; i++)
		{
			copyArr[i] = tempDoubleArr[i];
		}
		
		/*
		 * i traverse the array checking if
		 * each element is less than 0
		 * if they are then I set that
		 * element equal to zero
		 */
		for(int i = 0 ; i<copyArr.length ; i++)
		{

			if(copyArr[i] < 0)
			{
				copyArr[i] = 0;
			}
			
		}
		
		//I return the modified array
		return copyArr;
	}

	
	public static int[] dropLowest(int[] tempArr)
	{
		// place holder int variable
		int smallestNum = 0;
		
		//I make a copy of the passed array
		int[] copyArr = new int[tempArr.length];
		
		for(int i = 0 ; i<tempArr.length ; i++)
		{
			copyArr[i] = tempArr[i];
		}
		
		/*
		 * i traverse the array checking if
		 * each element is less than 0
		 * if they are then I make that numbers index
		 * the new smallest, then i continue traversing 
		 * and i go through each element
		 */
		for(int i = 0 ; i<copyArr.length ; i++)
		{
			
			if(copyArr[i] < copyArr[smallestNum])
		    {
				smallestNum = i;
		    }
				
			
		}
		
		/*
		 * once ive found the smallest number then I take the
		 * index of that number and i set it to 0
		 */
		copyArr[smallestNum] = 0;
		
		//I return the modified array
		return copyArr;
	}
			
	
}
