package shapes;
/**
 * this is the class where I make rhombus objects
 */
public class Rhombus {
	//I give my rhombus' a side length
	private double sideLength;
	//I give my rhombus' a diagonal long length 
	private double diagonalLong;
	//I give my rhombus' a short diagonal length
	private double diagonalShort;
	
	/*
	 * in this constructor I give the rhombus object with a side length, short diagonal length and long diagonal length 
	 */
	public Rhombus (double d1, double d2)
	{	
		// here I found the formula to calculate the side length
		sideLength = (Math.sqrt((d1*d1)+(d2*d2)))/2;

		//I give the rhombus object a long length
		diagonalLong = d1;

		//i give the rhombus object a short length
		diagonalShort = d2;
		
	}
	
	/*
	 * this calculates and returns the area of a rhombus object
	 */
	public double getArea()
	{
		return (diagonalLong*diagonalShort)/2;
	}
	
	/*
	 * this calculates and returns the perimeter of a rhombus object
	 */
	public double getPerimeter()
	{
		return sideLength*4;
	}
	
	/*
	 * this calculates and returns the length of the long side of a rhombus object
	 */
	public double getD1()
	{
		return Math.sqrt(4*(sideLength*sideLength)-(diagonalShort*diagonalShort));
	}
	
	/*
	 * this prints out the sum of all interior angles of any rhombus object
	 */
	public static void getInteriorAngles()
	{
		System.out.println("The sum of the interior angles of the rhombus is 360 degrees" + "\n");
	}
	
}
