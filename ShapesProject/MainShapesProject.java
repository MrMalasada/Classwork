package shapes;

/**
 * this is the class where I call make my objects from 
 * the different shapes classes for my 
 * Shapes Project
 */
public class ShapesProject {

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
		 * this instantiates a new circle object, myCirc3 which is equal to the value
		 * of myCirc1
		 */
		Circle myCirc3 = myCirc1;
		
		/*
		 * The next two print statements print out the reference code for my circle one and two
		 */
		System.out.println(myCirc1 + "\n"); 
		
		System.out.println(myCirc2 + "\n"); 
		
		// this prints out the reference code for myCirc3
		System.out.println(myCirc3 + "\n");
		
		//this prints out the radius for myCirc1 by using .getRadius() from my Circle class
		System.out.println(myCirc1.getRadius() + "\n");
		
		/*
		 * this sets the radius of myCirc1 to 6.1 because and variation of 67 is banned within this classroom
		 * and I will be fired if I leave it as is. It does this by using the .setRadius() from my Circle class
		 */
		myCirc1.setRadius(6.1);
		
		//this prints out the radius of myCirc1 by using .getRadius() from my circle class
		System.out.println(myCirc1.getRadius() + "\n");
		
		// this prints out the circumference of myCirc1 by using .getCircumf from my circle class
		System.out.println(myCirc1.getCircumf() + "\n");
		
		// this prints out the area of myCirc1 by using .getArea from my circle class
		System.out.println(myCirc1.getArea() + "\n");
		
		//this prints out Circle.getDegrees() which states the amount of degrees in a circle
		System.out.println(Circle.getDegrees() + "\n");
		
		//this code states the shape is a circle
		Circle.stateShape();
		
		// this instantiates a new square object with a side length of 5.0
		Square squareOne = new Square (5.0);
		
		// this instantiates a new square object with a side length of 4.6
		Square squareTwo = new Square (4.6);
		
		// this instantiates a new square object with a side length of 8.4
		Square squareThree = new Square (8.4);
		
		//this calculates the area for squareOne and prints it out
		System.out.println(squareOne.getArea() + "\n");
		
		//this calculates the perimeter for squareTwo and prints it out
		System.out.println(squareTwo.getPerimeter() + "\n");
		
		//this calculates the Diagonal lenfth for squareThree and prints it out
		System.out.println(squareThree.getDiagonalLength() + "\n");
		
		//this prints out the sum of the interior angles for all squares
		System.out.println(Square.getSumOfInteriorAngles() + "\n");

		//I move to a new shape here, my third shape: rhombus
		
		//I make a rhombus object with a long side of 5.0 and a short side of 4.0
		Rhombus rhombusOne = new Rhombus (5.0, 4.0);
		
		//I make a rhombus object with a long side of 9.0 and a short side of 2.0
		Rhombus rhombusTwo = new Rhombus (9.0, 2.0);
		
		//I make a rhombus object with a long side of 6.2 and a short side of 6.1
		Rhombus rhombusThree = new Rhombus (6.2, 6.1);
		
		//this prints out the area of rhombus object one
		System.out.println(rhombusOne.getArea() + "\n");
		
		//this prints out the perimeter of rhombus object two
		System.out.println(rhombusTwo.getPerimeter() + "\n");
		
		//this prints out the long diagonal length of rhombus object three
		System.out.println(rhombusThree.getD1() + "\n");
		
		//this prints out the sum of all interior angles for all rhombus'
		Rhombus.getInteriorAngles();
		
		//I'm going to be moving to my forth shape: pentagon
		
		//I make a new pentagon object with a side length of 8
		Pentagon pentagonOne = new Pentagon (8);
		
		//I make a new pentagon object with a side length of 10
		Pentagon pentagonTwo = new Pentagon (10);
		
		//I make a new pentagon object with a side length of 3
		Pentagon pentagonThree = new Pentagon (3);
		
		/*
		 * I print out the area of pentagon object one
		 */
		System.out.println(pentagonOne.getArea() + "\n");
		
		/*
		 * I print out the Diagonal Length of pentagon object two
		 */
		System.out.println(pentagonTwo.getDiagonal() + "\n");
		
		/*
		 * I print out the perimeter of pentagon object three
		 */
		System.out.println(pentagonThree.getPerimeter() + "\n");
		
		//prints the sum of interior angles of all pentagons
		Pentagon.getSumOfInteriorAngles();
		
		//I'm going to be moving to my fifth shape: Trapazoid
		
		/*
		 * Here I make a new trapaziod 3 objects and give them bases, tops, side lengths and heights
		 */
		Trapazoid trapOne = new Trapazoid (3, 6, 2, 1, 1);
		
		Trapazoid trapTwo = new Trapazoid (4, 8, 4, 3, 3);
		
		Trapazoid trapThree = new Trapazoid (4, 10, 6, 5, 5);
		
		//This prints the area of trapazoid one
		System.out.println(trapOne.getArea() + "\n");
		
		//this prints the perimeter of trapaziod two
		System.out.println(trapTwo.getPerimeter() + "\n");
		
		//this prints the height of trapazoid three
		System.out.println(trapThree.getHeight() + "\n");
		
		//this prints the sum of the interior angles of all trapazoids
		Trapazoid.getSumOfInteriorAngles();
		
		//I'm going to be moving to my sixth shape: Triangle
		
		/*
		 * Here I make three new triangle objects each with their own side lengths and heights
		 */
		Triangle triOne = new Triangle (3,5,2,4);
		
		Triangle triTwo = new Triangle (4,6,3,5);
		
		Triangle triThree = new Triangle (2,4,1,3);
		
		//This prints the area of triangle one
		System.out.println(triOne.getArea() + "\n");
		
		//this prints the perimeter of triangle two
		System.out.println(triTwo.getPerimeter() + "\n");
		
		//this prints the base of triangle three
		System.out.println(triThree.getBase() + "\n");
		
		//this prints the sum of all interior angles of a triangle object
		Triangle.getSumOfInteriorAngles();
		
		//I'm going to move onto my 7th shape: Parallelogram
		
		/*
		 * I make three new parallelogram objects with 
		 * a long and short side and a height
		 */
		Parallelogram paraOne = new Parallelogram(6,3,2);
		
		Parallelogram paraTwo = new Parallelogram(5,2,1);
		
		Parallelogram paraThree = new Parallelogram(8,5,4);
		
		//this prints the area of parallelogram object one
		System.out.println(paraOne.getArea() + "\n");
		
		//this prints the height of parallelogram object two
		System.out.println(paraTwo.getHeight() + "\n");
			
		//this prints the area of parallelogram object three
		System.out.println(paraThree.getArea() + "\n");
		
		// this prints the sum of all interior angles of a parallelogram object
		Parallelogram.getSumOfInteriorAngles();
		
		//I'm going to move onto my 8th shape: SemiCircle
		
		/*
		 * I make three new semiCircle objects with 
		 *  different radius'
		 */
		SemiCircle semCirc1 = new SemiCircle(5);
		
		SemiCircle semCirc2 = new SemiCircle(6);
		
		SemiCircle semCirc3 = new SemiCircle(9);
		
		// this prints the area of semiCirc1
		System.out.println(semCirc1.getArea() + "\n");
	
		//this prints the perimeter of semiCirc2
		System.out.println(semCirc2.getPerimeter() + "\n");
		
		//this prints the volume of semicirc3
		System.out.println(semCirc3.getVolume() + "\n");
		
		//this prints the sum of all the interior angles of a semicircle
		SemiCircle.getSumOfInteriorAngles();
		
		//I'm going to move on to my 9th shape: Octogon
		
		/*
		 * I make three new octogon objects with
		 * different side lengths
		 */
		Octogon octoOne = new Octogon(8);
			
		Octogon octoTwo = new Octogon(21);
			
		Octogon octoThree = new Octogon(4);
			
		//this prints the area of octOne
		System.out.println(octoOne.getArea() + "\n");
			
		//this prints the perimeter of octoTwo
		System.out.println(octoTwo.getPerimeter() + "\n");
			
		//this prints the height of of octoThree
		System.out.println(octoThree.getHeight() + "\n");
		
		//this prints the sum of all interior angles of an octogon object
		Octogon.getSumOfInteriorAngles();
		
		//I'm going to move onto my 10th shape:Dodecagon
		
		/*
		 * here I make three new dodecagon objects 
		 * with different side lengths
		 */
		Dodecagon dodecaOne = new Dodecagon(58);
		
		Dodecagon dodecaTwo = new Dodecagon(127);
		
		Dodecagon dodecaThree = new Dodecagon(910);
		
		//this prints the perimeter of dodecaOne
		System.out.println(dodecaOne.getPerimeter() + "\n");
		
		//this prints the area of dodecaTwo
		System.out.println(dodecaTwo.getArea() + "\n");
		
		//this prints the apotham of dodecaThree
		System.out.println(dodecaThree.getApotham() + "\n");	
		
		//this prints the sum of all interior angles of dodecagon objects
		Dodecagon.getSumOfInteriorAngles();
		
		//I'm going to move onto my 11th shape: GreatRhombicosidodecahedron
		
		/*
		 * here i make three new GreatRhombicosidodecahedron objects
		 * with different side lengths
		 */
		GreatRhombicosidodecahedron ohDearOne = new GreatRhombicosidodecahedron (3);
		
		GreatRhombicosidodecahedron ohDearTwo = new GreatRhombicosidodecahedron (8);
		
		GreatRhombicosidodecahedron ohDearThree = new GreatRhombicosidodecahedron (48);
		
		//this prints the circumradius of ohDearOne
		System.out.println(ohDearOne.getCircumradius() + "\n");
		
		//this prints out the surface area of ohDearTwo
		System.out.println(ohDearTwo.getSurfaceArea() + "\n");
		
		//this prints the volume of ohDearThree
		System.out.println(ohDearThree.getVolume() + "\n");
		
		//this prints the sum of interior angles of all GreatRhombicosidodecahedrons
		GreatRhombicosidodecahedron.getSumOfInteriorAngles();
		
		//I'm going to move on to my 12th shape: Megagon
		
		/*
		 * here I make three new megagon objects with
		 * different side lengths and a number of sides
		 * that is reset to 1000000
		 */
		Megagon megOne = new Megagon (2,4);
		
		Megagon megTwo = new Megagon (6,7);
		
		Megagon megThree = new Megagon (1,9);
		
		// this prints the circumradius of megOne
		System.out.println(megOne.getCircumradius() + "\n");
		
		//this prints teh diameter of megTwo
		System.out.println(megTwo.getDiameter() + "\n");
		
		//this prints the surface area of megThree
		System.out.println(megThree.getSurfaceArea() + "\n");
		
		//this prints the sum of all interior angles of megagon objects
		Megagon.getSumOfInteriorAngles();
		
		//I'm going to move on to my 13th shape: pyramid
		
		/*
		 * Here i make three new pyramid objects one with
		 * a side length of 64, another with 27 and the last
		 * one with 2
		 */
		Pyramid pyraOne = new Pyramid (64);
		
		Pyramid pyraTwo = new Pyramid (27);
		
		Pyramid pyraThree = new Pyramid (2);
		
		// this prints the area of a face for pyraOne
		System.out.println(pyraOne.getFaceArea() + "\n");
		
		//this prints the height of pyraTwo
		System.out.println(pyraTwo.getHeight() + "\n");
		
		//this prints the surface area of pyraThree
		System.out.println(pyraThree.getSurfaceArea() + "\n");
		
		//this prints the number of faces for any given pyramid object
		Pyramid.getFaces();
		
		//I'm going to move on to my 14th shape: sphere
		
		/*
		 * here i make three new sphere objects
		 * each with different radius'
		 */
		Sphere ballOne = new Sphere(120);
		
		Sphere ballTwo = new Sphere(16);
		
		Sphere ballThree = new Sphere(21);
		
		//this prints the diameter of ballOne
		System.out.println(ballOne.getDiameter() + "\n");
		
		//this prints the surface area of ballTwo
		System.out.println(ballTwo.getSurfaceArea() + "\n");
		
		//this prints the volume of ballThree
		System.out.println(ballThree.getVolume() + "\n");
		
		//this prints the shape of any given sphere obhject 
		Sphere.stateShape();
		
		//I'm going to move on to my 15th shape: rectangle
		

		// this instantiates a new square object with a side length of 5.0
		Rectangle rectOne = new Rectangle (34,21);
		
		// this instantiates a new square object with a side length of 4.6
		Rectangle rectTwo = new Rectangle (98,2);
		
		// this instantiates a new square object with a side length of 8.4
		Rectangle rectThree = new Rectangle (53,102);
		
		//this calculates the area for squareOne and prints it out
		System.out.println(rectOne.getArea() + "\n");
		
		//this calculates the perimeter for squareTwo and prints it out
		System.out.println(rectTwo.getPerimeter() + "\n");
		
		//this calculates the Diagonal lenfth for squareThree and prints it out
		System.out.println(rectThree.getDiagonalLength() + "\n");
		
		//this prints out the sum of the interior angles for all squares
		System.out.println(Rectangle.getSumOfInteriorAngles() + "\n");
		
			
	}
}
