
public class AlteringArraysProblem {

	public static void main(String[] args) {
		
		// orininal numbner arr
		int[] nums = {7,6,3,9};
		
		/*
		 * i put the new array made from 
		 * subract5FromAll4 into a seperate array outside of the
		 * method so i can access it
		 */
		int[] result = subract5FromAll4(nums);
		
		/*
		 * this traverses the array, printing each element
		 */
		for(int i = 0 ; i < result.length ; i++)
		{
			System.out.print(result[i] + ", ");
			
		}
		
	}

	/*
	 * this is the method in which I take a passes array and subtract 5 from each element
	 */
	public static int[] subract5FromAll4(int[] tempArr)
	{
		//I make a copy of they passes array
		int[] copyArr = new int[tempArr.length];
		
		//this assigns they new array the same elements as the original
		for(int i = 0 ; i<tempArr.length ; i++)
		{
			copyArr[i] = tempArr[i];
		}
		
		/*
		 * this traverses the array subtracting 4 from
		 * each element in the array
		 */
		for(int i = 0 ; i<copyArr.length ; i++)
		{

			copyArr[i] = copyArr[i] - 4;
			
		}
		//I return the new array
		return copyArr;
	}
}
