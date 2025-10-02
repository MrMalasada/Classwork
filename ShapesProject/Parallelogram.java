package shapes;
/**
 * this is the class where I make parallelogram objects
 */
public class Parallelogram {
	
	/*
	 * i make three private null doubles for the long side, 
	 * short side and the height
	 */
	private double longSide;
	
	private double shortSide;
	
	private double height;
	
	/*
	 * in this constructor i give the parallelogram object a
	 * long side, short side and a height
	 */
	public Parallelogram (double l, double s, double h)
	{
		longSide = l;
		
		shortSide = s;
		
		height = h;
	}
	
	/*
	 * this calculates and returns the area of a parallelogram
	 * object
	 */
	public double getArea()
	{
		return longSide*height;
	}
	
	/*
	 * this calculates and returns the height of a parallelogram
	 * object
	 */
	public double getHeight()
	{
		return (longSide*height)/longSide;
	}
	
	/*
	 * this calculates and returns the
	 * perimeter of a parallelogram object
	 */
	public double getPerimeter()
	{
		return 2*(shortSide+longSide);
	}
	
	//this prints the sum of all interior angles of a parallelogram object
		public static void getSumOfInteriorAngles()
		{
			System.out.println("The sum of all of the interior angles of a parallelogram is 360 degrees");
		}
	
}
