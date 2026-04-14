// factorial

public int factorial(int n) {
  if (n == 0)
  {
    return 1;
  }
  else
  {
    return n * factorial(n-1);
  }
}

//bunny ears

public int bunnyEars(int bunnies) {
  if (bunnies == 0)
  {
    return 0;
  }
  else
  {
    return 2+bunnyEars(bunnies-1);
  }
}

//fibonacci
