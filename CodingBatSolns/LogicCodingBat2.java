// my code for alarm clock

public String alarmClock(int day, boolean vacation) {
  if (vacation && (day == 0 || day == 6)){
      return "off";
    }
  else if (vacation){
    return "10:00";
  }
  else if (day >= 1 && day <=5){
    return "7:00";
  }
  else{
    return "10:00";
  }
}


//my code for in1To10

public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
        return (n <= 1 || n >= 10);
    } else {
        return (n >= 1 && n <= 10);
    }
}

//my code for old35

public boolean old35(int n) {
  boolean multOf3 = (n%3 == 0);
  boolean multOf5= (n%5 == 0);
  if ((multOf3 && !multOf5) || (!multOf3 && multOf5)){
    return true;
  }
  else{
    return false;
  }
}
