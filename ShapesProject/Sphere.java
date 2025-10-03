package shapes;
/**
 * this is the class where I make sphere objects
 */
public class Sphere {
 
	/*
	 * here I make a private null double
	 * called radius 
	 */
	private double radius;
	
	/*
	 * in this constructor I give the sphere 
	 * a radius
	 */
	public Sphere (double r)
	{
		radius = r;
	}
	
	/*
	 * this calculates and returns the
	 * surface area of a sphere object
	 */
	public double getSurfaceArea()
	{
		return 4*(Math.PI)*(radius*radius);
	}
	
	/*
	 * this calculates and returns the
	 * volume of a sphere object
	 */
	public double getVolume()
	{
		return (4/3)*(Math.PI)*(radius*radius*radius);
	}
	
	/*
	 * this calculates and returns the
	 * diameter of a sphere object
	 */
	public double getDiameter()
	{
		return 2*(radius);
	}
	
	/*
	 * this prints out the shape of
	 * any given sphere object
	 */
	public static void stateShape()
	{
		System.out.print("This Shape is a sphere");
	}
	
}
