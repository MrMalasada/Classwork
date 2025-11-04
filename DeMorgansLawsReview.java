//For tasks 1 and 2, answer for what values of x and y it would print "option 1" or "option 2"

//TASK 1:
if (!(x < 3 || y > 2)) System.out.println("option 1");
else System.out.println("option 2");

/*
* MY ANSWER
* For every case where (x<3) and (y>2) are true it would print "option 2", in every other
* case "option 1" will print
*/

//TASK 2:
if (!(x < 3 && y > 2)) System.out.println("option 1");
else System.out.println("option 2");

/*
* MY ANSWER
* For every case where (x<3) and (y>2) are both true it would print "option 2", in every other
* case "option 1" will print
*/

//For the rest of the tasks, answer which choice is equivalent to the given boolean expression.

//TASK 3:
!(x > 2 && y < 4)
C. (x <= 2) || (y >= 4)

//TASK 4:
!(x == 2 && y > 4)
D. (x != 2) || (y <= 4)

//TASK 5:
!(x!=5 && y!=7)
A. (x == 5) || (y == 7)


//TASK 6:
!(x<= 5 && y > 7)
D. (x > 5) || (y <= 7)

//Source: https://runestone.academy/ns/books/published/apcsareview/Conditionals/cDeMorgans.html#:~:text=DeMorgan's%20laws%20were%20developed%20by,%26%26%20(y%20%3E%202)%20.&text=Applying%20DeMorgan's%20Laws%20to%20!(,%26%26%20y%20%3E%202)%20yields%20!(
