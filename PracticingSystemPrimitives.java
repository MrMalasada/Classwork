public class TestExample {

	public static void main(String[] args) {

		// The following code from this line to line 17, prints out "RILEY" with "0"'s
	    System.out.println("0 0 0           00000      0             000000         0           0");
	    System.out.println("0      0          0        0             0               0         0");
	    System.out.println("0        0        0        0             0                0       0");
	    System.out.println("0        0        0        0             0                 0     0");
	    System.out.println("0       0         0        0             0000               0   0");
	    System.out.println("0      0          0        0             0                   0 0");
	    System.out.println("0     0           0        0             0                    0");
	    System.out.println("0  0              0        0             0                    0");
	    System.out.println("0    0            0        0             0                    0");
	    System.out.println("0      0          0        0             0                    0");
	    System.out.println("0        0      00000      00000         000000               0");
	    System.out.println(" ");
	   
	    
	    /*the following 2 lines of code prints out the answer for  6.0 x (3.5 - 1.5 x 5)
	                                                                 --------------    
	                                                                  55.6 - 30.2 
	    */
	    
	    System.out.println((6.0*(3.5-1.5*5))/(55.6-30.2));
	    System.out.println(" ");
	  
	    /*  Line  32 declares a double which is the radius, it is used in later code to calculate area and sircumference
	     */
	    
	    double radius = 4.0;
	    
	    /*  lines 35-39 declare 2 doubles, area and circumference, they are set to the formulas for the area of a circle and 
	     the formula for the circumference of a circle. Each of these doubles use the radius double as a changing variable so it can be 
	     adjusted for different circles  
	     */
	    
	    double areaOfCircle = 3.14*(radius * radius);
	    
	    double circumferenceOfCircle = 2*3.14*radius;
	    		
	    /* Line 47 of code is a System.out.print statement that prints the circles area and its circumference 
	      
	     */
	    
	    System.out.print("The circle has an area of" + " " + areaOfCircle +" and it has a circumference of " + circumferenceOfCircle);
	    
	}

}
