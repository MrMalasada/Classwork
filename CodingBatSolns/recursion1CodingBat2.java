// code for triangle
public int triangle(int rows) {
 
  if(rows == 0)
  {
    return 0;
  }
  else
  {
    return rows+triangle(rows-1);
  }
}

// code for sum digits

public int sumDigits(int n) {
  if (n==0)
  {
    return 0;
  }
  else
  {
    return (n%10)+sumDigits(n/10);
  }
}

// code for powerN

public int powerN(int base, int n) {
  if(n==0)
  {
    return 1;
  }
  else
  {
    return base*powerN(base,n-1);
  }
}
