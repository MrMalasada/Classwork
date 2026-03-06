package twoDArrays;

public class TwoDArraySorter {

	public static void main(String[] args) {
		
		double [][] arrToSort = 
			{
					{2.0,4.6},
					{8.9,0.5},
					{5.4,3.2},
					{1.0,9.1}	
			};
		
		checkArr(leftRightTopDown(arrToSort));

	}
	
	// Create a method that is passed a 2-D array of doubles and sorts it from left-right, top-down order.
	public static double[][] leftRightTopDown (double[][] sortThis)
	{
	
		double[] BEFLATTENED = new double[sortThis.length * sortThis[0].length];
		
		double[][] emptyForNow = new double[sortThis.length][sortThis[0].length];
	    int idx = 0;
	    for (int i = 0; i < sortThis.length; i++) {
	        for (int j = 0; j < sortThis[i].length; j++) {
	        	BEFLATTENED[idx] = sortThis[i][j];
	            idx++;
	        }
	    }
		
	    boolean isSorted = false;
		
		int misplacedCounter = 0;
		
		  double min = BEFLATTENED[0];
			
		  int minLoc;
		
		while(isSorted == false)
		{
			for(int i = 0 ; i<BEFLATTENED.length - 1 ; i++)
			{
				isSorted = true;
				
				for(int b = i ; b<BEFLATTENED.length - 1 ; b++)
				{

					if (BEFLATTENED[i]>BEFLATTENED[i+1])
					{
						double placeHolder = 0.0;
						
						placeHolder = BEFLATTENED[i];
						
						BEFLATTENED[i] = BEFLATTENED[i+1];
						
						BEFLATTENED[i+1] = placeHolder;
						
						isSorted = false;
						
						misplacedCounter ++;	
						
					}
					else if (misplacedCounter == 0)
					{
						isSorted = true;
					}

				}
				
			}
			
			for(int i = 0 ; i<BEFLATTENED.length - 1 ; i++)
			{
				if (BEFLATTENED[i]>BEFLATTENED[i+1])
				{
					isSorted = false;
					
					misplacedCounter ++;	
					
				}
				else if (misplacedCounter == 0)
				{
					isSorted = true;
				}

			}
		
			misplacedCounter = 0;
		}
		
		int counter = 0;
		idx = 0;
		for (int i = 0; i < emptyForNow.length; i++) {
		    for (int j = 0; j < emptyForNow[i].length; j++) {
		    	emptyForNow[i][j] = BEFLATTENED[idx];
		        idx++;
		    }
		}
	
		
		return emptyForNow;
	}
	
    // checkArr helper method  prints all elements of a 2-D array
    public static double[][] checkArr(double[][] arrToPrint) 
    {
        for (int i = 0; i < arrToPrint.length; i++) 
        {
            System.out.println();
            for (int b = 0; b < arrToPrint[i].length; b++) 
            {
                System.out.print(arrToPrint[i][b] + " ");
            }
        }
        System.out.println();
        return arrToPrint;
    }
	

    
    // the code below is the reminance of what i was trying to follow along in class
    /*
     * for(int i = 0 ; i<sortThis[0].length ; i++)
		{
			for(int k = 0 ; k<sortThis.length ; k++)
			{
				
			
			
			int min = sortThis[0][i];
			
			int minLoc = 0;
			
				for(int j = 0 ; j<sortThis.length ; j++)
				{
					if(sortThis[j][i]<min)
					{
						min = sortThis[j][i];
						minLoc = j;
					}
				}
			
			int temp = sortThis[minLoc][i];
			sortThis[minLoc][i] = sortThis
			}
		}
     */
    
}
		}
		
		return sortThis;
	}
	
    // checkArr helper method  prints all elements of a 2-D array
    public static int[][] checkArr(int[][] arrToPrint) 
    {
        for (int i = 0; i < arrToPrint.length; i++) 
        {
            System.out.println();
            for (int b = 0; b < arrToPrint[i].length; b++) 
            {
                System.out.print(arrToPrint[i][b] + " ");
            }
        }
        System.out.println();
        return arrToPrint;
    }
	

    /*
     * for(int i = 0 ; i<sortThis[0].length ; i++)
		{
			for(int k = 0 ; k<sortThis.length ; k++)
			{
				
			
			
			int min = sortThis[0][i];
			
			int minLoc = 0;
			
				for(int j = 0 ; j<sortThis.length ; j++)
				{
					if(sortThis[j][i]<min)
					{
						min = sortThis[j][i];
						minLoc = j;
					}
				}
			
			int temp = sortThis[minLoc][i];
			sortThis[minLoc][i] = sortThis
			}
		}
     */
    
}
