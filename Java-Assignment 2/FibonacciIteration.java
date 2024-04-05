/* 1.	Find the Fibonacci Series up to Nth Term in Java Language

a.	Method 1: Using Iteration (Using Three variables)
 
  */

public class FibonacciIteration {
    public static void main(String[] args) {
        int N = 10; // Number of terms
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= N; ++i) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}


/* Output :

Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 

*/

