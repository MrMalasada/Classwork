// my code for rotateLeft3

public int[] rotateLeft3(int[] nums) {
   return new int[] {nums[1], nums[2], nums[0]};
}

// my code for reverse3

public int[] reverse3(int[] nums) {
    return new int[] {nums[2], nums[1], nums[0]};
}

// my code for maxEnd3

public int[] maxEnd3(int[] nums) {
  int[] copyArr = new int[nums.length];
  
  int max;
  
  if (nums[0] > nums[2]) 
  {
    max = nums[0];
  } 
  else 
  {
    max = nums[2];
  }
  
  for(int i = 0; i < copyArr.length; i++) 
  {
    copyArr[i] = max;
  }
  
  return copyArr;
}

// my code for sum2

public int sum2(int[] nums) {
  if (nums.length == 0) 
  {
    return 0;
  } 
  else if (nums.length == 1) 
  {
    return nums[0];
  } 
  else 
  {
    return nums[0] + nums[1];
  }
}

// my code for middleWay

public int[] middleWay(int[] a, int[] b) {
  return new int[] {a[1], b[1]};
}

// my code for makeEnds

public int[] makeEnds(int[] nums) {
   return new int[] {nums[0], nums[nums.length - 1]};
}


