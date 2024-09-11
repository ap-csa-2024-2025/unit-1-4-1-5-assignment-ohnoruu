/*
 * Write a program which takes a four digit number then prints the digits of this number one per line in reverse order.

Hint: Break this challenge down into repetitions of the steps used for activity 1. Using multiple variables will let you store digits and intermediate results you need.

Sample run:
```
Four digit number:
5678

Here are the digits:
8
7
6
5
```
 */

 public class Problem3{
    public static void main (String[]args){
        int num = 5678;
        System.out.println(num%10);
        num/=10;
        System.out.println(num%10);
        num/=10;
        System.out.println(num%10);
        num/=10;
        System.out.println(num%10);
        num/=10;
    }
 }
