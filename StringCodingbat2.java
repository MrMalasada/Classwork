//my code for makeOutWord
/*
* I took the first half of the String "out" by doing .substring(0,2)
* I knew it would work becuase the problem stated that it has a length of 4
* characters. I didn't have to do anything for word. I got the last half of "out"
* by using substring and taking the length of it and minusing two and setting it to that
* and the length.
*/
public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring((out.length()-2),out.length());
}

//my code for extraEnd
/*
* I got the last two by using a substring and taking the length minus two and length.
* those in a substring will give me the last two characters of any string. I put that in
* a String variable and returned that three times.
*/
public String extraEnd(String str) {
    String lastTwo = str.substring(str.length()-2,str.length());
    return lastTwo + lastTwo + lastTwo;
}

//my code for firstTwo
/*
* I didn't understand how to do this at first because I knew how to 
* do each part seperately but not together. So I did research on the 
* Math method and found a method that will work for what I needed to do
* I used Math.min, which when passed two numbers will select the smaller of the two,
* and I did Math.min(2,str.length()) which will either give me the first two or return
* whatever is in the String
*/
public String firstTwo(String str) {
    String firstLetters = str.substring(0,Math.min(2,str.length()));
    
    return firstLetters;
}

//my code for withoutEnd
/*
* this unlike the other ones was very easy. I didn't want the first and 
* last letters so I did a substring starting at 1 to get rid of the first letter
* and I did the length minus one two get rid of the last letter. Then I returned it.
*/
public String withoutEnd(String str) {
    return str.substring(1,str.length()-1);
}
