package arrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class CovertingArrayAlgsToArrayListAlgs {

	public static void main(String[] args) {
		/*
		 * 1. Create a method checkFor4() that is passed an ArrayList and 
		 * returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
		 * 
		 * 2. Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. 
		 * The ArrayList will have any 5’s deleted from nums.
		 * Ex: subtract5FromAll4( {5, 5, 0, 8, 5, 20}  )   -------turns nums into----->     {0, 8, 20}
		 * 
		 * 3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
		 */

		//ArrayList to alter in the methods
		//I used the List.of method because I was too lazy to add the extra lines of code
		ArrayList <Integer> num = new ArrayList<Integer>(List.of(1,25,5,131235,3,2,4567,5,7,8,5,19,92));
		
		//prints out the method checkFor4 to check if it works
		System.out.println(checkFor4(num));
		
		//checks if the bubble sort works
		System.out.println(getBubbleSort(num));
		
	}
	
	/*
	 * traverses the array list and checks if there is a 4
	 * if there is the result is changed to 4, if not then the result
	 * remains unchanged at -1
	 */
	public static int checkFor4(ArrayList <Integer> arrList)
	{
		int result = -1;
		
		for(int i = 0 ; i < arrList.size()-1 ; i++)
		{ 
			if(arrList.get(i) == 4)
			{
				result = 4;
			}
		}
		
		return result;
	}
	
	/*
	 * this traverses the array and checks if there is a 5 and if there is, then it will remove it
	 */
	public static void ridOfFives (ArrayList <Integer> arrToAlter)
	{
		for(int i = 0 ; i < arrToAlter.size()-1 ; i++)
		{ 
			if(arrToAlter.get(i) == 5)
			{
				arrToAlter.remove(i);
				i--;
			}
		}
	}
	
	/*
	 * This is my bubble sort algorithm but it is 
	 * adjusted to be compatable with ArrayLists
	 */
	public static ArrayList <Integer> getBubbleSort(ArrayList <Integer> arrToAlter)
	{
		boolean isSorted = false;
		
		int misplacedCounter = 0;
		
		while(isSorted == false)
		{
			for(int i = 0 ; i<arrToAlter.size() - 1 ; i++)
			{
				isSorted = true;
				if (arrToAlter.get(i)>arrToAlter.get(i+1))
				{
					int placeHolder = 0;
					
					placeHolder = arrToAlter.get(i);
					
					arrToAlter.set(i, arrToAlter.get(i+1));
					
					arrToAlter.set(i+1, placeHolder);
					
					isSorted = false;
					
					misplacedCounter ++;	
					
				}
				else if (misplacedCounter == 0)
				{
					isSorted = true;
				}

			}
			
			for(int i = 0 ; i<arrToAlter.size() - 1 ; i++)
			{
				if (arrToAlter.get(i)>arrToAlter.get(i+1))
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
		
		return arrToAlter;
	}


}
