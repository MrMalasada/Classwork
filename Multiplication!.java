
public class Multiplication {

	public static void main(String[] args) {
		
		System.out.println(multiply(5,5));

	}
	
	public static int multiply (int a, int b)
	{
		int count = a;
		
		int num = 0;
		
		while (count > 0)
		{
			num += b;
			
			count -- ;
		}
			
		return num;
	}

}
