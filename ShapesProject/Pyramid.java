package shapes;
/**
 * this is the class where I make Pyramid objects
 */
public class Pyramid {
	
	//here i declare a private null double named edge length
	private double edgeLength;
	
	/*
	 * in this constructor i give the pyramid 
	 * object an edge length
	 */
	public Pyramid(double e)
	{
		edgeLength = e;
	}
	
	/*
	 * this calculates and return the height of a pyramid object
	 */
	public double getHeight()
	{
		return ((Math.sqrt(6))/3) * edgeLength;
	}
	
	/*
	 * this calculates and returns the
	 * face area of a pyramid object
	 */
	public double getFaceArea()
	{
		return (Math.sqrt(3) / 4) * edgeLength * edgeLength;
	}
	
	public double getSurfaceArea()
	{
		return Math.sqrt(3) * edgeLength * edgeLength;
	}
	
	public static void getFaces()
	{
		System.out.println("A pyramid has 4 faces");
	}
	
}

