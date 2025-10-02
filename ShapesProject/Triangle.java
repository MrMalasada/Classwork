package shapes;
/**
 * this is the class where I make triangle objects
 * I give them 3 side lengths and a height
 */
public class Triangle {
	private double sideLength1;
	
	private double sideLength2;
	
	private double sideLength3;
	
	private double height;
	
	/*
	 * this constructer is where I give the triangle object 3 sidelengths and a height
	 */
	public Triangle (double s1, double s2, double s3, double h)
	{
		sideLength1 = s1;
		
		sideLength2 = s2;
		
		sideLength3 = s3;
		
		height = h;
	}
	
	/*
	 * this calculates the area of a triangle object using the area formula
	 */
	public double getArea()
	{
		return 1.0/2*(sideLength2)*height;
	}
	
	/*
	 * this claculates the perimeter of a trianle object by adding the side lengths
	 */
	public double getPerimeter()
	{
		return sideLength1+sideLength2+sideLength3;
	}
	
	/*
	 * this calculates the base of a triangle
	 */
	public double getBase()
	{
		return (sideLength1+sideLength2+sideLength3)-sideLength1-sideLength3;
	}
	
	// this prints the sum of the interior angles of all triangles
	public static void getSumOfInteriorAngles()
	{
		System.out.println("The sum of all of the interior angles of a triangle is 180 degrees");
	}
	
}


