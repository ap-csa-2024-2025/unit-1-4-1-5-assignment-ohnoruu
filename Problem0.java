/*## Problem0
Make a program that creates two variables: an int and a double.  Follow these instructions in the exact order below.
1. Create a variable of type `double` and store an int value into it.
2. Print out the value of the variable.
3. Run your program and observe the result.
4. Create a variable of type `int` and store a double value into it.
5. Print out the value of the variable.
6. Run myour program and observe the result.

Is it possible to store a double into an int?  Is it possible to store an int into a double?  Explain. */

public class Problem0
{
  public static void main(String[] args)
  {
    double num1 = 1;
    System.out.print(num1);
    int num2 = 5.0;
    System.out.print(num2);
    // no, because Java returns an error
  }
}
