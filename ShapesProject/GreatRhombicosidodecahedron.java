package shapes;
/**
 * this is the class where i make Great Rhombicosidodecahedron objects
 */
public class GreatRhombicosidodecahedron {
	
	// here I make a private null double called sidelength
	private double sideLength;
	
	/*
	 * in this constructor i give the GreatRhombicosidodecahedron object
	 * a side length
	 */
	public GreatRhombicosidodecahedron (double l)
	{
		sideLength = l;
	}
	
	/*
	 * this calculates and returns the surface area of a GreatRhombicosidodecahedron object
	 */
	public double getSurfaceArea()
	{
		return (30+(5*Math.sqrt(3))+(3*Math.sqrt(25))+(10*Math.sqrt(5)))*(sideLength*sideLength);
	}
	
	/*
	 * this calculates and returns the surface area of
	 * a GreatRhombicosidodecahedron object
	 */
	public double getVolume()
	{
		return (1/4)*(60+29*Math.sqrt(5))*(sideLength*sideLength*sideLength);
	}
	
	/*
	 * this calculates and returns the circumradius of 
	 * a GreatRhombicosidodecahedron object
	 */
	public double getCircumradius()
	{
		return (1/2)*Math.sqrt(11+(4*Math.sqrt(5)));
	}
	
	/*
	 * this prints the sum of all the interior angles of a GreatRhombicosidodecahedron object
	 */
	public static void getSumOfInteriorAngles()
	{
		System.out.print("The sum of all of the interior angles of a Great Rhombicosidodecahedron is 42480 degrees");
	}
	
}
