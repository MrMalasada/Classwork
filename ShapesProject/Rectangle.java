package shapes;

public class Rectangle {

	/*
	 *  this declares the length of the long and short sides of my rectangle
	 */
	private double sideLengthL;
	
	private double sideLengthS;
	
	/*
	 * This is the constructor that I use to generate rectangle objects and give
	 * them a side length
	 */
	public Rectangle (double s, double l)
	{
		sideLengthS = s;
		
		sideLengthL = l;
	}
	
	// This returns the area of a rectangle object by multiplying length time width
	public double getArea()
	{
		return sideLengthL*sideLengthS;
	}
	
	//This returns the Perimeter of a rectangle object by multiplying the sidelength by 4
	public double getPerimeter()
	{
		return (2*sideLengthS)+(2*sideLengthL);
	}
	
	/*
	 * This returns the diagonal length of a square by muliplying the side length by
	 * the square root of 2
	 */
	public double getDiagonalLength()
	{
		return Math.sqrt((sideLengthL*sideLengthL)+(sideLengthS*sideLengthS));
	}
	
	//This is a static method that returns the sum of all the interior angles of a rectangle object
	public static int getSumOfInteriorAngles()
	{
		return 360;
	}
	
	
}
