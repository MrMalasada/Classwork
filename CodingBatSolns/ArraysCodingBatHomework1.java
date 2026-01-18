// my code for firstLast6

public boolean firstLast6(int[] nums) {
  
  int i = 0;
  
  for(i=0 ; i<nums.length ; i++)
  {
    int checkOne = nums[0];
    
    int checkTwo = nums[nums.length-1];
    
    if ((checkOne == 6) || (checkTwo == 6))
    {
      return true;
    }
    else
    {
      return false;
    }
    }
    
    return false;
  }

// my code for sameFirstLast

public boolean sameFirstLast(int[] nums) {
  
  for (int i = 0 ; i<nums.length ; i++)
  {
    int firstEle = nums[0];
    
    int lastEle = nums[nums.length-1];
    
    if((nums.length >= 1) && (firstEle == lastEle))
    {
      return true;
    }
    else 
    {
      return false;
    }
  }
  return false;
}

/*
* my code for makePi, this honestly
* got me confused for a moment before I
* realized that it was easier than my 
* mind was making it out to be
*/
public int[] makePi() {
  
  return new int[] {3, 1, 4};

}

// my code for common end

public boolean commonEnd(int[] a, int[] b) {
  
  int aFirstEle = a[0];
  
  int aLastEle = a[a.length-1];
  
  int bFirstEle = b[0];
  
  int bLastEle = b[b.length-1];
  
  if((aFirstEle == bFirstEle) || (aLastEle == bLastEle))
  {
    return true;
  }
  else
  {
    return false;
  }
}

// my code for sum3

public int sum3(int[] nums) {
  
  int sumOfAll = 0;
  
  for(int i = 0 ; i<nums.length ; i++)
  {
    sumOfAll = sumOfAll + nums[i];
  }
  
  return sumOfAll;
}

