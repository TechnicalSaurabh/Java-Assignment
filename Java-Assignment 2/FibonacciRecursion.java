/* Method 2: Using Recursion */

public class FibonacciRecursion {
    public static void main(String[] args) {
        int N = 10; // Number of terms
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}




/* Output:

Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 

*/