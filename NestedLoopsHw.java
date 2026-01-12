import java.util.Scanner;
public class NestedLoopsHomeWork {

	public static void main(String[] args) {
		
		System.out.println("Type a number greater than 0 and you will get a table with that many rows and columns");
		
		Scanner inputReader = new Scanner(System.in);
		
		int buildTable = inputReader.nextInt(); 
		
		buildMultTable(buildTable);

	}
	
	public static void buildMultTable(int num)
	{
		
		int i = 0;
		
		int count = 0;
		
		int currentNum = 0;
		
		for(; i <= num - 1 ; i++)
		{
			
			while(count <= num - 1)
			{
				count ++;
				
				currentNum ++;
				System.out.print(currentNum + "\t");
				
				
			}
			
			count = 0;
			
			System.out.println("");
			
		}

	}
	

}
