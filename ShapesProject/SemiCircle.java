package shapes;
/**
 * this is the class where I make semicircle objects
 */
public class SemiCircle {
	
	//here I make a private null double radius
	private double radius;
	
	/*
	 * in this constructor i give the semicircle object a radius
	 */
	public SemiCircle(double r)
	{
		radius = r;
	}
	
	/*
	 * this calculates and returns the area of a semicircle object
	 */
	public double getArea()
	{
		return (Math.PI*(radius*radius))/2;
	}
	
	/*
	 * this calculates and returns the perimeter of a semicircle object
	 */
	public double getPerimeter()
	{
		return (Math.PI*radius)+(2*radius);
	}
	
	/*
	 * this calculates and returns the volume of a semicircle object
	 */
	public double getVolume()
	{
		return (2.0/3) * Math.PI * Math.pow(radius, 3);
	}
	
	//this prints the sum of all interior angles of a semicircle object
	public static void getSumOfInteriorAngles()
	{
		System.out.print("The sum of all of the interior angles of a SemiCircle is 180 degrees");
	}
	
}
