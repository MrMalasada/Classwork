package shapes;

/**
 * In this class I make square objects
 */
public class Square {

	/*
	 *  this declares the length of a single side of my square, since all the sides
	 *   are the same length I only need to declare one side
	 */
	private double sideLength;
	
	/*
	 * This is the constructor that I use to generate square objects and give
	 * them a side length
	 */
	public Square (double s)
	{
		sideLength = s;
	}
	
	// This returns the area of a square object by squaring the side length of a square object
	public double getArea()
	{
		return sideLength*sideLength;
	}
	
	//This returns the Perimeter of a square object by multiplying the sidelength by 4
	public double getPerimeter()
	{
		return 4*sideLength;
	}
	
	/*
	 * This returns the diagonal length of a square by muliplying the side length by
	 * the square root of 2
	 */
	public double getDiagonalLength()
	{
		return sideLength * Math.sqrt(2);
	}
	
	//This is a static method that returns the sum of all the interior angles of a square object
	public static int getSumOfInteriorAngles()
	{
		return 360;
	}
	
}

