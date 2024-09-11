/*
 * Write a program that takes a single integer and stores it in a variable. Your program should increase the value of this variable by one four times, printing "number is now " followed by its value each time, then decrease it by one four times, again printing "number is now " and the value each time. You must use unary operators to increase/decrease the value of the variable to receive full credit for this assignment.

Sample Run
```
Initial value: 24
number is now 25
number is now 26
number is now 27
number is now 28
number is now 27
number is now 26
number is now 25
number is now 24
```
 */
public class Problem1{
    public static void main (String[]args){
        int num = 22;
        System.out.println("Initial value: " + num);
        num++;
        System.out.println("number is now " + num);
        num++;
        System.out.println("number is now " + num);
        num++;
        System.out.println("number is now " + num);
        num++;
        System.out.println("number is now " + num);
        num++;
        System.out.println("number is now " + num);
        num--;
        System.out.println("number is now " + num);
        num--;
        System.out.println("number is now " + num);
        num--;
        System.out.println("number is now " + num);
        num--;
    }
}
