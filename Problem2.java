/*
 * ## Problem2
Write a program which takes a positive three digit integer and prints out the digits one per line in order.

Hint: Integer division can give you one of the digits, a combination of Integer division and modulus can be used to get the second digit, and modulus alone will be used to get the other.

Sample run:
```
Three digit number: 678

Here are the digits:
8
7
6
```
 */

 public class Problem2{
    public static void main (String[]args){
        int num = 283;
        System.out.println(num%10);
        num/=10;
        System.out.println(num%10);
        num/=10;
        System.out.println(num%10);
    }
 }
