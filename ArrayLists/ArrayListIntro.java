package twoDArrays;

import java.util.ArrayList;


public class ArrayListIntro {

	public static void main(String[] args) {
		//1. Instantiate an empty ArrayList that could have any type in it.
		
		ArrayList <String> names = new ArrayList<String>();

		//2. Instantiate an empty ArrayList called intArrList that specifically stores Integers. Repeat this for Strings.
		
		ArrayList <Integer> intArrList = new ArrayList<Integer>();
		
		ArrayList <String> stringArrList = new ArrayList<String>();

		//3. Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}

		intArrList.add(1); System.out.println(intArrList);    stringArrList.add("Alice"); System.out.print(stringArrList);
		
		intArrList.add(2); System.out.println(intArrList);    stringArrList.add("Bob"); System.out.print(stringArrList);
		
		intArrList.add(3); System.out.println(intArrList);    stringArrList.add("Charlie"); System.out.print(stringArrList);
		
		//4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}

		intArrList.add(2,5);     stringArrList.add(1,"Derek");
		
		//5. Print out the second and last elements in both intArrList and stringArrList.
		
		System.out.println(intArrList.get(1));     System.out.println(stringArrList.get(1)); System.out.print(stringArrList);
		
		System.out.println(intArrList.getLast());  System.out.println(stringArrList.getLast()); System.out.print(stringArrList);

		//6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change. 

		System.out.println(intArrList); System.out.print(stringArrList);
		
		intArrList.set(0, 0); System.out.println(intArrList);     stringArrList.set(0, "Zero"); System.out.print(stringArrList);
		
		//7. Delete the last element in both arrays. Print out what that removed element was. 
		
		int intToBeRemoved = intArrList.getLast();
		
		String stringToBeRemoved = stringArrList.getLast();
		
		intArrList.remove(intArrList.getLast()); System.out.print(stringArrList);
		
		stringArrList.remove(stringArrList.getLast()); System.out.print(stringArrList);

		System.out.print(intToBeRemoved);
		
		System.out.print(stringToBeRemoved);
		
	}

}
