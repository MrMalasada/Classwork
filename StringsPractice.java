import java.util.Scanner;

public class StringPractice {

	
	

		static Scanner inputReader = new Scanner(System.in);
		public static void main(String[] args) {
			
			
			Scanner inputReader = new Scanner(System.in);

			
			
			
			stopLoop();
			addToCircle();
		

			
			
			
			inputReader.close();
		}

		
		public static void stopLoop()
		{
			int stop = 0;
			int count =0;
			while(stop<1)
			{
		
				count++;
				String playerInput = inputReader.nextLine();
				if(playerInput.equals("stop") )
				{
					System.out.println("stopped at input number " + (count-1));
					stop++;
				}
				else 
				{
					System.out.println(playerInput + " " + count);
				}
				
			}
		}
		
		
		public static void addToCircle()
		{
			System.out.println("Select a startic circle value (in the form of a double)");
			
			double initialRadius = inputReader.nextDouble();
			
			Circle myCircle = new Circle (initialRadius);
			double startRadius = myCircle.getRadius();
			double endRadius = myCircle.getRadius();
			
			for (int i = 0; i < 5; i++) 
	        {
				System.out.println("Type a number to be added to the radius");
				double circleRadius = inputReader.nextDouble();
				endRadius += circleRadius;
	        }
			System.out.println("You started with a radius of " + startRadius +" and ended with a radius of " + endRadius + ".");
			
		}
	
	
}
	
	
	
	
	
	

