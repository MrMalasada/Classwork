package twoDArrays;

public class TwodDArraysIntroAssignent {

    public static void main(String[] args) {

        // 1. Initialize a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword.
        int[][] gridNums = new int[4][6];

        for (int i = 0; i < gridNums.length; i++) 
        {
            for (int b = 0; b < gridNums[i].length; b++) 
            {
                System.out.print(gridNums[i][b] + " ");
            }
        }
        System.out.println("\n");

        // 2. initialize a 2-D array with the following values:
        // 4, 5, 7
        // 2, -1, 8
        // 0, 1, 3
        int[][] hardCodedNums = {
            {4, 5, 7},
            {2, -1, 8},
            {0, 1, 3}
        	};

        for (int i = 0; i < hardCodedNums.length; i++) 
        {
            for (int b = 0; b < hardCodedNums[i].length; b++) 
            {
                System.out.print(hardCodedNums[i][b] + " ");
            }
        }
        System.out.println("\n");

        // 3. For both of those arrays, change the element in the first row, first column to a 17.
        gridNums[0][0] = 17;
        hardCodedNums[0][0] = 17;

        System.out.println("Check for number 3:");
        checkArr(gridNums);
        checkArr(hardCodedNums);
        System.out.println("\n");

        // 4. For both of those arrays, change the element in the second row, third column into a 20.
        gridNums[1][2] = 20;
        hardCodedNums[1][2] = 20;

        System.out.println("Check for number 4:");
        checkArr(gridNums);
        checkArr(hardCodedNums);
        System.out.println("\n");

        // 5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length
        gridNums[0][gridNums[0].length - 1] = -5;
        hardCodedNums[0][hardCodedNums[0].length - 1] = -5;

        System.out.println("Check for number 5:");
        checkArr(gridNums);
        checkArr(hardCodedNums);
        System.out.println("\n");

        // 6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length
        gridNums[gridNums.length - 1][0] = -7;
        hardCodedNums[hardCodedNums.length - 1][0] = -7;

        System.out.println("Check for number 6:");
        checkArr(gridNums);
        checkArr(hardCodedNums);
        System.out.println("\n");

        // 7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length
        gridNums[gridNums.length - 1][gridNums[gridNums.length - 1].length - 1] = -30;
        hardCodedNums[hardCodedNums.length - 1][hardCodedNums[hardCodedNums.length - 1].length - 1] = -30;

        System.out.println("Check for number 7:");
        checkArr(gridNums);
        checkArr(hardCodedNums);
        System.out.println("\n");

        // 8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row.
        System.out.println("Question 8 - First row of each array:");
        printFirstRow(gridNums);
        printFirstRow(hardCodedNums);
        System.out.println("\n");

        // 9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
        System.out.println("Question 9 - First column of each array:");
        printFirstColumn(gridNums);
        printFirstColumn(hardCodedNums);
        System.out.println("\n");

        // 10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order.
        System.out.println("Question 10 - Row-major order:");
        printRowMajor(gridNums);
        printRowMajor(hardCodedNums);
        System.out.println("\n");

        // 11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order.
        System.out.println("Question 11 - Column-major order:");
        printColumnMajor(gridNums);
        printColumnMajor(hardCodedNums);
    }

    // checkArr helper method - prints all elements of a 2-D array
    public static int[][] checkArr(int[][] arrToPrint) {
        for (int i = 0; i < arrToPrint.length; i++) {
            System.out.println();
            for (int b = 0; b < arrToPrint[i].length; b++) {
                System.out.print(arrToPrint[i][b] + " ");
            }
        }
        System.out.println();
        return arrToPrint;
    }

    // 8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row.
    public static void printFirstRow(int[][] arr) {
        for (int b = 0; b < arr[0].length; b++) {
            System.out.print(arr[0][b] + " ");
        }
        System.out.println();
    }

    // 9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
    public static void printFirstColumn(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();
    }

    // 10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order.
    public static void printRowMajor(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int b = 0; b < arr[i].length; b++) {
                System.out.print(arr[i][b] + " ");
            }
        }
        System.out.println();
    }

    // 11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order.
    public static void printColumnMajor(int[][] arr) {
        for (int b = 0; b < arr[0].length; b++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][b] + " ");
            }
        }
        System.out.println();
    }
}
