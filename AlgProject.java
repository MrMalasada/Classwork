
public class AlgsProj {

	public static void main(String[] args) {
		
		int[]  subjectToArr = {3,2,5,6,3,3,3,3,3,3,3,-2,7,8,9,1,-766652,88,-57,5,5,5,5,5,5,21,-8,4,79,0,5,5,5,5,5,5,5,5,5,5,0,-64,-1234567890}; 

		for(int i = 0 ; i< subjectToArr.length ; i++)
		{
			int[] getSortedArr = insertionSort(subjectToArr);
		
			System.out.print(getSortedArr[i] + ", ");
		}

	}
	
	// 1. Return the smallest number in the array
	public static int findSmallest(int[] arr) {
	    int smallest = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] < smallest) {
	            smallest = arr[i];
	        }
	    }
	    return smallest;
	}

	// 2. Return the index of the smallest number in the array
	public static int findSmallestIndex(int[] arr) {
	    int smallestIndex = 0;
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] < arr[smallestIndex]) {
	            smallestIndex = i;
	        }
	    }
	    return smallestIndex;
	}

	// 3. Return the average of all numbers in the array
	public static double findAverage(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return (double) sum / arr.length;
	}

	// 4. Return true if all numbers in the array are even, false otherwise
	public static boolean allEven(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] % 2 != 0) {
	            return false;
	        }
	    }
	    return true;
	}

	// 5. Change consecutive 5's to 0's
	public static void changeConsecutiveFives(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] == 5 && arr[i + 1] == 5) {
	            arr[i] = 0;
	            arr[i + 1] = 0;
	        }
	    }
	}

	// 6. Return true if any number shows up three times in a row
	public static boolean hasThreeInARow(int[] arr) {
	    for (int i = 0; i < arr.length - 2; i++) {
	        if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
	            return true;
	        }
	    }
	    return false;
	}

	// 7. Return how many times a number shows up in the array
	public static int countOccurrences(int[] arr, int target) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            count++;
	        }
	    }
	    return count;
	}

	// 8. Reverse the array
	public static void reverseArray(int[] arr) {
	    for (int i = 0; i < arr.length / 2; i++) {
	        int temp = arr[i];
	        arr[i] = arr[arr.length - 1 - i];
	        arr[arr.length - 1 - i] = temp;
	    }
	}

	// 9. Shift all elements to the right
	public static void shiftRight(int[] arr) {
	    if (arr.length == 0) return;
	    
	    int last = arr[arr.length - 1];
	    for (int i = arr.length - 1; i > 0; i--) {
	        arr[i] = arr[i - 1];
	    }
	    arr[0] = last;
	}

	// 10. InsertionSort
	
	public static int[] insertionSort(int[] sortThis) 
	{
		 for(int i = 1; i < sortThis.length; i++)  // Start at 1, not 0
		    {
		        for(int b = i; b > 0; b--)
		        {
		            if(sortThis[b] < sortThis[b-1])
		            {
		                int placeHolder = sortThis[b];
		                sortThis[b] = sortThis[b-1];
		                sortThis[b-1] = placeHolder;
		            }
		        }
		    }
		    
		    return sortThis;
	}

}
