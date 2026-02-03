
public class BubbleSort {

	public static void main(String[] args) {
		
		int[]  arrToSort = {3,2,5,6,3,-2,7,8,9,1,-766652,88,-57,21,-8,4,79,-64}; 
		
		/*
		 * 
		 
		for(int i = 0 ; i< arrToSort.length ; i++)
		{
			int[] getEditedArr = getSwapFirstandThird(arrToSort);
			
			System.out.print(getEditedArr[i]);
		}
		
		System.out.println("");
		*/
		for(int i = 0 ; i< arrToSort.length ; i++)
		{
			int[] getBubbledArr = getBubbleSort(arrToSort);
		
			System.out.print(getBubbledArr[i] + ", ");
		}

	}
	
	public static int[] getSwapFirstandThird(int[] arr)
	{
		int placeHolder = 0;
		
		placeHolder = arr[0];
		
		arr[0] = arr[2];
		
		arr[2] = placeHolder;
		
		return arr;
	}
	
	public static int[] getBubbleSort(int[] arr)
	{
		boolean isSorted = false;
		
		int misplacedCounter = 0;
		
		while(isSorted == false)
		{
			for(int i = 0 ; i<arr.length - 1 ; i++)
			{
				if (arr[i]>arr[i+1])
				{
					int placeHolder = 0;
					
					placeHolder = arr[i];
					
					arr[i] = arr[i+1];
					
					arr[i+1] = placeHolder;
				}
			}
			
			for(int i = 0 ; i<arr.length - 1 ; i++)
			{
				
				if (arr[i]>arr[i+1])
				{
					isSorted = false;
					
					misplacedCounter ++;
					
				}
				else if (misplacedCounter == 0)
				{
					isSorted = true;
				}
			}
			misplacedCounter = 0;
		}
		
		return arr;
	}

}
