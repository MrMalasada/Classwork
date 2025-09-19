public class ShapesMain {

	public static void main(String[] args) {
		
		/*
		 * Calls circle constructor to generate a new circle object
		 * with the radius of 6.7
		 */
		Circle myCirc1 = new Circle (6.7);
		
		/*
		 * Instantiates a new circle object by calling the circle constructor
		 * to generate a circle object with a radius of 5.4
		 */
		Circle myCirc2 = new Circle (5.4);
		
		/*
		 * The next two print statements print out the reference code for my circle one and two
		 */
		System.out.println(myCirc1); 
		
		System.out.println(myCirc2); 
		
		/*
		 * this instantiates a new circle object, myCirc3 which is equal to the value
		 * of myCirc1
		 */
		Circle myCirc3 = myCirc1;
		
		// this prints out the reference code for myCirc3
		System.out.println(myCirc3);
		
		//this prints out the radius for myCirc1 by using .getRadius() from my Circle class
		System.out.println(myCirc1.getRadius());
		
		/*
		 * this sets the radius of myCirc1 to 6.1 because and variation of 67 is banned within this classroom
		 * and I will be fired if I leave it as is. It does this by using the .setRadius() from my Circle class
		 */
		myCirc1.setRadius(6.1);
		
		//this prints out the radius of myCirc1 by using .getRadius() from my circle class
		System.out.println(myCirc1.getRadius());
		
		// this prints out the circumference of myCirc1 by using .getCircumf from my circle class
		System.out.println(myCirc1.getCircumf());
		
		// this prints out the area of myCirc1 by using .getArea from my circle class
		System.out.println(myCirc1.getArea());
		
		//this prints out Circle.getDegrees() which states the amount of degrees in a circle
		System.out.println(Circle.getDegrees());
		
		//this code states the shape is a circle
		Circle.stateShape();
		
	}
  
}
