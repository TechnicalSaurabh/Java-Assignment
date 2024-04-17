/*  9. Write a program that creates a Calculator class.
The class contains two variables of integer type. Design a constructor that accepts two values as parameter and set those values.

Design four methods named Add(),Subtract(),multiply(),Division() for performing addition,subtraction,multiplication and division of two numbers.

For addition and subtraction,two numbers should be positive.If any negative number is entered then throw an exception in respective methods.

So design an exceptionhandler(ArithmeticException)in Add() and Subtract() methods respectively to check whether any number is negative or not.

For division and multiplication two numbers should not be zero.If zero is entered for any number then throw an exception in respective methods.
So design an exceptionhandler(ArithmeticException)inmultiply()andDivision()methods respectively to check whether any number is zero or not.

Write a main class and declare four objects of Calculator class.Perform addition(objl),subtraction(obj2),multiply(obj3) and division(obj4) operations for these objects.
If any non integer values are provided as input; then you should throw an exception(NumberFormatException)and display a message that informs the user of the wrong input before exiting*/

package exception;
import java.util.*;
public class Calculator {
private int num1;
private int num2;

public Calculator(int num1, int num2) {

this.num1 = num1;
this.num2 = num2;
}
public int add() {
if(num1 < 0 || num2 < 0) {
throw new ArithmeticException("Both numbers should not be -ve");
}
return num1+num2;
}

public int sub() {
if(num1 < 0 || num2 < 0) {
throw new ArithmeticException("Both numbers are greater than 0");
}
return num1-num2;
}



public int mul() {
if(num1 == 0 || num2 == 0) {
throw new ArithmeticException("Both numbers should not be zero");
}
return num1*num2;
}

public double div() {
if(num2 == 0) {
throw new ArithmeticException("Denominator should not be zero");
}
return(double)num1/num2;
}


public static void main(String[] args) {
System.out.println("Enter the two numbers...");
Scanner sc=new Scanner(System.in);
        try {
        String num1=sc.next();
        String num2=sc.next();
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        Calculator obj=new Calculator(n1,n2);
        System.out.println("Addition: " +obj.add());
        System.out.println("Subtraction: " +obj.sub());
        System.out.println("Multiplication: " +obj.mul());
        System.out.println("Division: " +obj.div());
       
       
        }catch(NumberFormatException e) {
        System.out.println("please provide valid inputs");
        System.out.println(e.getMessage());
        }
        catch(ArithmeticException e) {
        System.out.println(e.getMessage());
        }
}

}

/* Output:

Enter the two numbers...
-20 30
Both numbers should not be -ve

Enter the two numbers...
20 10
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2.0

Enter the two numbers...
0 10
Addition: 10
Subtraction: -10
Both numbers should not be zero

Enter the two numbers...
s10 22
please provide valid inputs
For input string: "s10"

*/