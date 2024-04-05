//Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array) 

public class FibonacciArray{
    public static void main(String[] args) {
        int N = 10; // Number of terms
        int[] fib = new int[N];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
    }
}


/* output:
Fibonacci Series: 1 2 3 5 8 13 21 34 

*/