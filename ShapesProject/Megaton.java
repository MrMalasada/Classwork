package shapes;
/**
 * this is the class where i make megagon objects
 */
public class Megagon {

	/*
	 * here i make 2 private null doubles for sideLength
	 * and sides
	 */
	private double sideLength;
	
	private double sides;
	
	/*
	 * in this constructor I give the megagon a side length and 
	 * number of sides
	 */
	public Megagon (double s, int l)
	{
		sideLength = s;
		
		l = 1000000;
		
		sides = l;
	}
	
	/*
	 * this calculates and returns the surface area of
	 * a megagon object
	 */
	public double getSurfaceArea()
	{
		return sideLength * sides;
	}
	
	/*
	 * this calculates and returns the circumradius of a
	 * megagon object
	 */
	public double getCircumradius()
	{
		return sideLength / (2 * Math.sin(Math.PI / sides));
	}
	
	/*
	 * this calculates and returns the diameter
	 * of a megagon object
	 */
	public double getDiameter()
	{
		return 2*(sideLength / (2 * Math.sin(Math.PI / sides)));
	}
	
	// this prints the sum of all the interior angles of any given megagon object
	public static void getSumOfInteriorAngles()
	{
		System.out.print("The sum of all of the interior angles of an Megagon is 1799998000 degrees");
	}
	
}

