package CubeProject;

/**
 * This class calculates the surface area and volume of a cube 
 * given its side length, then prints the results as integers.
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
		
		final double sideArea = sideLength*sideLength;
		
		/*
		 *  this declares "surfaceArea" as a double and sets it equal to 
	       the surface area formula, getting the surface area of the cube
		 */
		
		final double surfaceArea = 6*sideArea;
	
		/*
		 *  this declares "volume" as a double and sets it to the volume formula
		   getting the volume of the cube
		 */
		
		final double volume = sideLength * sideLength * sideLength;
	
		/*
		 *  this prints the surface area and the volume of the cube in a
		   sentence 
		 */
		
		System.out.print("The surface area of this cube is " + (int) surfaceArea + " and the volume is " + (int) volume);
	}
}
