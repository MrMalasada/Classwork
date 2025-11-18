
	
	
	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	 * the following question: what does this method do?
	 * 
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line does what?
		 * 
		 * It still works even though str was not instantiated in the method.
		 * 
		 * it is likely to be an instance variable
		 * 
		 * */

		int l = this.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * it'll try to access an index that doesnt exist
		 * 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * it checks if the carackter at the index i is equal to the passed char
			 * if true it prints the value of i
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * it is returned when c is not found
		 */
		return -1;
		
	}
	
