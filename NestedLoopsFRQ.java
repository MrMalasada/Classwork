
public class NestedIterationFrq {

	public static void main(String[] args) {
		
		randomizeUntilNum(7,6);

	}
	
	public static void randomizeUntilNum(int num, int iter)
	  {
	    int randNum = (int) ((Math.random() * 9) + 1);

	    boolean printedNum = false;

	    while(iter>0)
	      {
	        while(!printedNum)
	          {
	            if(randNum == num)
	            {
	              System.out.print(randNum);
	              
	              randNum = (int) ((Math.random() * 10) + 1);

	              printedNum = true;
	            }
	            else if(randNum != num)
	            {
	              System.out.print(randNum);
	              
	              randNum = (int) ((Math.random() * 10) + 1);
	              

	              printedNum = false;
	            }
	          }

	        System.out.println("");

	        iter --;
	        
	        printedNum = false;
	      }
	}
	          

	      

}
