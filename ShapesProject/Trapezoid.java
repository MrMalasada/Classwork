package shapes;
/**
 * this is the class where i make trapazoid objects
 */
public class Trapazoid {
	
	/*
	 * here i make 5 null private doubles for
	 * baseTop, baseBottom, height, sideL and sideR
	 */
	private double baseTop;
	
	private double baseBottom;
	
	private double height;
	
	private double sideL;
	
	private double sideR;
	
	/*
	 * in this constructor I give the trapazoid parameters for
	 * the top and bottom base, height and left and right sides
	 */
	public Trapazoid(double b1, double b2, double h, double l, double r)
	{
		baseTop = b1;
		
		baseBottom = b2;
		
		height = h;
		
		sideL = l;
		
		sideR = r;
		
	}
	
	/*
	 * this calculates and returns the area of trapazoid objects
	 */
	public double getArea()
	{
		return ((baseTop+baseBottom)/2)*height;
	}
	
	/*
	 * this calculates and returns the perimeter of trapazoid objects
	 */
	public double getPerimeter()
	{
		return sideR + sideL + baseTop + baseBottom;
	}
	
	/*
	 * this calculates and returns the height of trapazoid objects
	 */
	public double getHeight()
	{
		return 2 * (((baseTop+baseBottom)/2)*height)/(baseBottom+baseTop);
	}
	
	//this prints out the sum of all the interior angles of all trapazoid objects
	public static void getSumOfInteriorAngles()
	{
		System.out.print("The sum of all of the interior angles of a trapazoid is 360 degrees");
	}

}
