/* Q.5 Write a program to calculate the square value of any number given by the user .Add an exception handling block to 
check whether the user enter letters instead of numbers . */

import java.util.*;

public class SquareValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }
        int number = sc.nextInt();
        int square = number * number;
        System.out.println("The square of " + number + " is " + square + ".");
    }
}



/* Output:
Enter a number: 8
The square of 8 is 64.


Enter a number: sau
ERROR!
Error: Please enter a valid number.

*/
