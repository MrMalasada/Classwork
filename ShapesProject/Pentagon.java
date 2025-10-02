package shapes;
/**
 * this is the class where I make pentagon objects
 */
public class Pentagon {
	
	// I give my pentagon objects a side length
	private double sideLength;
	
	/*
	 * in this constructor I give the pentagon object object a side length 
	 */
	public Pentagon(double s)
	{
		sideLength = s;
	}

	/*
	 * this calculates the area of a pentagon object
	 */
	public double getArea()
	{
		return 1.0/4 * (Math.sqrt(5*(5+2*(Math.sqrt(5)))))*(sideLength*sideLength);
	}
	
	/*
	 * this calculates and returns the diagonal length of a pentagon object
	 */
	public double getDiagonal ()
	{
		return (1.0 + Math.sqrt(5))/2 * sideLength;
	}
	
	/*
	 * this calculates and returns the perimeter of a pentagon object
	 */
	public double getPerimeter()
	{
		return 5*(sideLength);
	}
	
	// this prints the sum of all the interior angles of a pentagon object
	public static void getSumOfInteriorAngles()
	{
		System.out.println("The sum of all of the interior angles of a pentagon is 540 degrees");
	}
	
}
