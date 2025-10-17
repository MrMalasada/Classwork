// this is my code for cigar party

public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend && cigars>40){
    return true;
  }
  else if(39<cigars && cigars<61)
  {
    return true;
  }
  else{
    return false;
  }
}

// here is my code for dateFashon
//currently not 100% working

public int dateFashion(int you, int date) {
  if (you >= 8 || date >= 8) {
      return 2;
  } else if (you >= 3 && date >= 3) {
      return 1;
  } 
  else if (you <= 2 || date <= 2) {
      return 0;
}
  else{
    return 0;
  }
}


//this is my code for squirrlPlay

public boolean squirrelPlay(int temp, boolean isSummer) {
  if (temp>=60 && isSummer && temp <=100){
    return true;
  }  
  else if (temp>=60 && temp <=90){
    return true;
  }
  else{
    return false;
  }
}

// this is my code for caughtspeeding
//currently not 100% working

public int caughtSpeeding(int speed, boolean isBirthday) {
  if (speed <=86 && isBirthday){
    return 1;
  }
  else if (speed >= 81){
    return 2;
  }
  else if (speed >= 65 && speed <= 85 && isBirthday){
    return 1;
  }
  else if (speed >= 61 && speed <= 80 && !isBirthday){
    return 1;
  }
  else if (speed <=65 && isBirthday){
    return 0;
  }
  else if (speed <60){
    return 0;
  }
  else{
    return 0;
  }
}

//here is my code for sorta sum

public int sortaSum(int a, int b) {
  if (((a+b) >= 20) || ((a+b)<=9) ){
    return a+b;
  }
  else{
    return 20;
  }
}


