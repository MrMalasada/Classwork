
public class LoopsIntroPractice {

	public static void main(String[] args) {

		System.out.println(countLetters("pppppppppp", 'p'));

		System.out.println(getFactorial(5));
		
	}

	public static int countLetters(String str , char letter)
	{
		int count = 0;
		
		for(int i = 0; i<str.length() ; i ++)
		{
			if(str.charAt(i) == letter)
			{
				count ++;
			}
		}
		return count;
	}
	
	public static int getFactorial(int toFactorial)
	{
		
		int sum = 1;
		
		for (toFactorial = toFactorial; toFactorial >= 1 ; toFactorial -- )
		{
			
			sum *= toFactorial;
			
		}
		
		return sum;
		
	}
	
	public static boolean getIfRepeats()
	{
		
		// code incomlete
		
		return false;
	}
	
}
