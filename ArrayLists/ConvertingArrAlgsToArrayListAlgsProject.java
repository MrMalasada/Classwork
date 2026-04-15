package arrayListAssignments;
import java.util.ArrayList;

public class ConvertingArrAlgsToArrayListAlgsProject {

	public static void main(String[] args) {
		/*
		 * 1. Return the smallest number in the ArrayList. 

		 * 2. Return the index of the smallest number in the ArrayList. 

		 * 3. Return the average of all numbers in the ArrayList. 

		 * 4. Return true if all numbers in the ArrayList are even, and return false otherwise.

		 * 5. If the ArrayList ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).

		 * 6. Return true if any number shows up three times in a row, and return false otherwise. 

		 * 7. Pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList. (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)

		 * 8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4}) YOU MAY NOT DO THIS THE SAME AS THE PREVIOUS PROJECT

9. Shift all elements in an ArrayList to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2}) YOU MAY NOT USE A LOOP

10. Use either selection sort or insertion sort to sort an ArrayList. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
		 */

	     ArrayList<Integer> list = new ArrayList<>();
	        list.add(4);
	        list.add(5);
	        list.add(5);
	        list.add(2);
	        list.add(1);

	        System.out.println("Original list " + list);
	        System.out.println("\n--- Method Results ---");

	        System.out.println("1. Smallest number:   " + findSmallest(list));
	        System.out.println("2. Index of smallest: " + findSmallestIndex(list));
	        System.out.println("3. Average:           " + findAverage(list));
	        System.out.println("4. All even?          " + allEven(list));

	        ArrayList<Integer> list5 = new ArrayList<>(list);
	        consecutiveFivesToZero(list5);
	        System.out.println("5. Consec. 5s -> 0s:  " + list5);

	        ArrayList<Integer> list6 = new ArrayList<>();
	        list6.add(3); list6.add(3); list6.add(3); list6.add(1); list6.add(2);
	        System.out.println("6. Three in a row " + list6 + "? " + threeInARow(list6));
	        System.out.println("6. Three in a row " + list + "?  " + threeInARow(list));

	        System.out.println("7. Count of 5s:       " + countOccurrences(list, 5));

	        ArrayList<Integer> list8 = new ArrayList<>(list);
	        reverseList(list8);
	        System.out.println("8. Reversed:          " + list8);

	        ArrayList<Integer> list9 = new ArrayList<>(list);
	        shiftRight(list9);
	        System.out.println("9. Shifted right:     " + list9);

	        ArrayList<Integer> list10 = new ArrayList<>(list);
	        selectionSort(list10);
	        System.out.println("10. Selection sorted: " + list10);
		
	}
	
	//Code for question 1
	public static int findSmallest(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }
	
	//Code for question 2
	public static int findSmallestIndex(ArrayList<Integer> list) {
        int smallestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
	
	//Code for question 3
	public static double findAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return (double) sum / list.size();
    }
	
	//Code for question 4
	public static boolean allEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // 5. Change consecutive 5's to 0's
    public static void consecutiveFivesToZero(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == 5 && list.get(i + 1) == 5) {
                list.set(i, 0);
                list.set(i + 1, 0);
            }
        }
    }

    // 6. Return true if any number shows up three times in a row
    public static boolean threeInARow(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).equals(list.get(i + 1)) && list.get(i).equals(list.get(i + 2))) {
                return true;
            }
        }
        return false;
    }

    // 7. Return how many times a value appears in the ArrayList
    public static int countOccurrences(ArrayList<Integer> list, int value) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                count++;
            }
        }
        return count;
    }

    // 8. Reverse the ArrayList in place (no Collections)
    public static void reverseList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // 9. Shift all elements to the right by one (no loop)
    public static void shiftRight(ArrayList<Integer> list) {
        int last = list.get(list.size() - 1);
        list.add(0, last);
        list.remove(list.size() - 1);
    }

    // 10. Sort using Selection Sort
    public static void selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

  
}


