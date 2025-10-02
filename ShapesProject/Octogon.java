package shapes;
/**
 * this is the class where I make octogon objects
 */
public class Octogon {
	
	//I make a private null double called sidelength
	private double sideLength;
	
	/*
	 * in this constructor I give the octogon object
	 * a side length
	 */
	public Octogon (double l)
	{
		sideLength = l;
	}
	
	/*
	 * this calculates and returns the area
	 * of a octogon object
	 */
	public double getArea()
	{
		return 2*(1+Math.sqrt(2))*(sideLength*sideLength);
	}
	
	/*
	 * this calculates and returns the 
	 * perimeter of a octogon object
	 */
	public double getPerimeter()
	{
		return 8*sideLength;
	}
	
	/*
	 * this calculates and returns the height 
	 * of a octogon object
	 */
	public double getHeight()
	{
		return sideLength*(1+Math.sqrt(2));
	}
	
	// this prints out the sum of all the interior angles of an octogon obnject
	public static void getSumOfInteriorAngles()
	{
		System.out.println("The sum of all of the interior angles of an octogon is 1080 degrees");
	}
	
}
