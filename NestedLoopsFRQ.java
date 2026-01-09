public static void randomizeUntilNum(int num, int iter)
  {
    int randNum = (int) (Math.random * 10) + 1);

    boolean printedNum = false;

    while(iter>0)
      {
        while(!printedNum)
          {
            if(randNum == num)
            {
              System.out.print(randNum);

              printedNum = true;
            }
            else if(randNum != num)
            {
              System.out.print(randNum);

              printedNum = true;
            }
          }

        System.out.println("");

        iter --;
      }
}
          

      
