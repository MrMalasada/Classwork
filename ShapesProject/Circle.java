/**
 * This is my circle class, in which I make circle objects
 */
public class Circle {

	//here I declare a null private double named radius
	private double radius;
	
	//here I declare a private final double named pi using Math.PI to be precise
	private final double pi = Math.PI;
	
	/*
	 * in this constructor I give the circle object object a radius 
	 */
	public Circle (double r)
	{
		radius = r;
		
	}
	
	/*
	 * here I return the radius of a circle object using a 
	 * nonvoid method so it is adaptable to any circle
	 */
	public double getRadius() 
	{
		return radius;
	}
	
	/*
	 * this method sets the radius of a circle object to a new radius
	 * this is here just in case someone uses the numbers that shall not be named
	 * the square root of 36 and square root of 49
	 */
	public void setRadius(double newRadius)
	{
		
		radius = newRadius;
		
	}
	
	/*
	 * this method returns the circumference of any given circle object
	 */
	public double getCircumf()
	{
		return (2*pi*radius);
	}
	
	/*
	 * this method returns the area of any given circle object
	 */
	public double getArea()
	{
		return (pi * radius * radius);
	}
	
	/*
	 * this method returns the degrees of any given circle object
	 */
	public static int getDegrees()
	{
		
		
		return 360;
	}
	/*
	 * this method states the shape of any given circle object
	 */
	public static void  stateShape()
	{
		System.out.println("This is a circle");
	}
}
