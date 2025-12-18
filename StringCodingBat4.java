// count hi
public int countHi(String str) {
   int count = 0;
		  for(int i=0; i<str.length()-1;i++)
		  {
		    if(str.substring(i, i+2).equals("hi"))
		    {
		      count++;
		    }
		  
		  }
		  return count;
		}
	
// my code for catDog

public boolean catDog(String str) {
    
		  int catCount = 0; 
		  int dogCount = 0;
		  
		  for(int i=0; i<str.length()-2; i++)
		  {
		    if(str.substring(i, i+3).equals("cat"))
		    {
		      catCount++;
		    }
		    else if (str.substring(i, i+3).equals("dog"))
		    {
		      dogCount++;
		    }
		  }
		  
		  if(catCount == dogCount)
		  {
		    return true;
		  }
		  
		  else
		  {
		    return false;
		  }
}

// my code for count code

public int countCode(String str) {
		  int count = 0; 
		  
		  for(int i=0; i<str.length()-3; i++)
		  {
		    if(str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e"))
		    {
		      count++;
		    }

		  }
		  
		  return count;

}

// my code for repeat end

	public String repeatEnd(String str, int n) {

		  String end = ""; 
		  
		  for(int i=0; i<n; i++)
		  {
		    String string = str.substring (str.length()-n);
		    end += string;
		  }
		  
		  return end;

  }
