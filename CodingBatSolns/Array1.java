// my code for has23

public boolean has23(int[] nums) {
  
  boolean contains23 = false;
  
  for (int i = 0 ; i < nums.length ; i++)
  {
    if (nums[i] == 2 || nums[i] == 3)
    {
      contains23 = true;
    }
  }
  
  return contains23;
}

// my code for no23

public boolean no23(int[] nums) {
 
  boolean containsNo23 = true;
  
  for (int i = 0 ; i < nums.length ; i++)
  {
    if (nums[i] == 2 || nums[i] == 3)
    {
      containsNo23 = false;
    }
  }
  
  return containsNo23;

}

// my code for makeLast

public int[] makeLast(int[] nums) {
  
    int numsLength = nums.length;

    int[] doubleNums = new int[numsLength * 2];

    doubleNums[doubleNums.length - 1] = nums[numsLength - 1];

    return doubleNums;
}

// my code for double23

public boolean double23(int[] nums) {
  
  boolean containsDouble23 = false;
  
  for (int i = 1 ; i<nums.length ; i++)
  {
    
    if (nums[i] == 2 || nums[i] == 3)
    {
      if (nums[i] == nums[i-1])
      {
        containsDouble23 = true;
      }
    }
    
  }
  
  return containsDouble23;
}

// my code for fix23

public int[] fix23(int[] nums) {

  int[] no23 = new int[nums.length];

  for (int i = 0; i < nums.length; i++) 
  {
      no23[i] = nums[i];

      if (i > 0 && no23[i - 1] == 2 && no23[i] == 3) 
      {
        no23[i] = 0;
      }
  }

    return no23;
}

// my code for start1

public int start1(int[] a, int[] b) {
  
  int startWith1 = 0;
  
   if (a.length > 0 && a[0] == 1) 
   {
        startWith1++;
   }

    if (b.length > 0 && b[0] == 1) 
    {
        startWith1++;
    }
  
  return startWith1;
}

// my code for biggerTwo

public int[] biggerTwo(int[] a, int[] b) {
  int sumA = a[0] + a[1];
  int sumB = b[0] + b[1];

    if (sumB > sumA) {
        return b;
    }
    return a;
}

// my initial code for makeMiddle

public int[] makeMiddle(int[] nums) {
  int endFirstHalf = (nums.length/2) - 1;
  int startSecondHalf = (nums.length/2);
  
  int [] middleTwo = new int[2];
  
  if (nums.length==2)
  {
    return nums;
  }
  else
  {
    middleTwo[0] = nums[endFirstHalf];
    middleTwo[1] = nums[startSecondHalf];
  }
  
  return middleTwo;
}

// my optimized code for makeMiddle cause I realized I could do it without if statements

public int[] makeMiddle(int[] nums) {
  int firstMidNum = nums.length / 2;

  return new int[] { nums[firstMidNum - 1], nums[firstMidNum] };
}

// my code for plusTwo

public int[] plusTwo(int[] a, int[] b) {
  
  int[] combineAr = new int[a.length + b.length];
  
    combineAr[0] = a[0];
    combineAr[1] = a[1];
    combineAr[2] = b[0];
    combineAr[3] = b[1];
  
  return combineAr;
}

// my code for swapEnds

public int[] swapEnds(int[] nums) {
  int [] swappedAr = new int[nums.length];
  
  for (int i = 0 ; i < nums.length ; i++)
  {
    if (i == 0)
    {
      swappedAr[i] = nums[nums.length - 1];
    }
    else if (i == (nums.length - 1))
    {
      swappedAr[i] = nums[0];
    }
    else
    {
      swappedAr[i] = nums[i];
    }
  }
  
  return swappedAr;
}

//my code for midThree

public int[] midThree(int[] nums) {
  
  int mid = nums.length/2;

  int[] midNums = new int[3];
  
  midNums[0] = nums[mid-1];

  midNums[1] = nums[mid];

  midNums[2] = nums[mid+1];
  
  return midNums;
}

// my code for maxTriple

public int maxTriple(int[] nums) {
  
  int midNum = nums[nums.length/2];
  
  int firstNum = nums[0];
  
  int lastNum = nums[nums.length-1];
  
  int largestNum = midNum;
  
  if (firstNum > largestNum) 
  {
    largestNum = firstNum;
  }
  if (lastNum > largestNum) 
  {
    largestNum = lastNum;
  }
  
  if (nums.length == 1)
  {
    return nums[0];
  }

  return largestNum;
}

// my code for frontPiece

public int[] frontPiece(int[] nums) {
  
  int[] firstTwo = new int[2];
  
  if (nums.length >= 2)
  {

    for (int i = 0 ; i<firstTwo.length ; i++)
    {
      firstTwo[i] = nums[i];
    }
  }
  else
  {
     return nums;
  }
  
  return firstTwo;
}

// my code for unlucky1

public boolean unlucky1(int[] nums) {
  if (nums.length < 2)
  {
    return false;
  }
  else if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
  {
    return true;
  }
  else if ((nums[nums.length-2] == 1 && nums[nums.length-1] == 3))
  {
    return true;
  }
  
  return false;

}

// my code for make2

public int[] make2(int[] a, int[] b) {

  int[] result = new int[2];

  if (a.length >= 2) 
  {
    result[0] = a[0];
    result[1] = a[1];
  } 
  else if (a.length == 1) 
  {
    result[0] = a[0];
    result[1] = b[0];
  } 
  else 
  { 
    result[0] = b[0];
    result[1] = b[1];
  }

    return result;
}

// my code for front11

public int[] front11(int[] a, int[] b) {
  if (a.length > 0 && b.length > 0) 
  {
    int[] fronts = new int[2];
      
    fronts[0] = a[0];
    
    fronts[1] = b[0];
        return fronts;
  } 
  else if (a.length > 0)
  { 
    int[] fronts = new int[1];
    
    fronts[0] = a[0];
  
    return fronts;
  } 
  else if (b.length > 0) { 
    int[] fronts = new int[1];

    fronts[0] = b[0];
    
    return fronts;
    } 
  else 
  {
    return new int[0];
  }
}
