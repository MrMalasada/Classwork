package shapes;
/**
 * this is the class where I make dodecagon objects
 */
public class Dodecagon {
	
	// I make a private null double named sidelength
	private double sideLength;
	
	/*
	 * in this constructor i give the dodecagon object a side
	 * length
	 */
	public Dodecagon (double s)
	{
		sideLength = s;
	}
	
	/*
	 * this calculates and returns the primeter of a dedecagon
	 * object
	 */
	public double getPerimeter()
	{
		return 12*sideLength;
	}
	
	/*
	 * this calculates and returns the area of
	 * a dedecagon object
	 */
	public double getArea()
	{
		return 3*(2+Math.sqrt(3)) * sideLength * (sideLength*sideLength);
	}
	
	/*
	 * this calculates and returns the apotham of
	 * a dodecagon object
	 */
	public double getApotham()
	{
		return sideLength*(1+(1/Math.sqrt(3)));
	}
	
	/*
	 * this prints the sum of all the interior objects of a dodecagon object
	 */
	public static void getSumOfInteriorAngles()
	{
		System.out.println("The sum of all of the interior angles of a dodecaogon is 1440 degrees");
	}
	
}
