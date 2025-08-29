package CubeProject;

/**
 *  this class takes a declared side length of cube and calculates the side area, side length, and the total volume
   at the end, it takes the calculations and prints them in a sentence 
*/

public class cubeCalculator {
	
	public static void main(String[] args) {
	
		/* 
		 * this declares "sideLength" as a double which is the length
		   of a side of the cube. This variable can be modified 
		   to find the side area, surface area, and volume of different codes
		*/
		double sideLength = 14;
		
		/* 
		 * this declares "sideArea" as a double and sets it to the area 
		   formula, getting the area of a single side of a cube
		 */
		
		double sideArea = sideLength*sideLength;
		
		/*
		 *  this declares "surfaceArea" as a double and sets it equal to 
	       the surface area formula, getting the surface area of the cube
		 */
		
		double surfaceArea = 6*sideArea;
	
		/*
		 *  this declares "volume" as a double and sets it to the volume formula
		   getting the volume of the cube
		 */
		
		double volume = sideLength * sideLength * sideLength;
	
		/*
		 *  this prints the surface area and the volume of the cube in a
		   sentence 
		 */
		
		System.out.print("The surface area of this cube is " + (int) surfaceArea + " and the volume is " + (int) volume);
	}
	
}
