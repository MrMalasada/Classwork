
public class TESTINGBABYYYY {

	/*
	 * This method is passed an int and it will tell you 
	 * what month of the year the number you give it corresponds to 
	 *
	*/
	public static String getMonth(int n)
		{
			// Stores the 12 months in a string variable
		
			String months = "January February March April May June "
					+ "July August September October November December ";

	    		// this for loop will run 12 times

			for (int i = 1; i <= 12; i++)
			{
				// takes the location of the spaces in the months string
				
				int sL = months.indexOf(' ');

	    		  	/* whenever the passed number is a value of i, it 
	    		  	 * takes the current sL value and prints the substring of that index
	    		  	 * and 0
	    		  	 */
				
				if (n == i)
				{
	        		/*takes the current sL value and returns a substring of 0 and the sl
					*value
					*/
					
					
					return months.substring(0, sL);
				}
	      			/* if the passed number is not a value of i
	      			 * it will run this code
	      			 */
					
				else
				{
	        		/* if the passed number is not a value of i, it takes the current
	        		 *  sL value and print a substring to that value plus one
	        		 */
					
					
					months = months.substring(sL + 1);
				}
			}
			//

			return months;
			
		}
	

}
