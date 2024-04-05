/* 5. Java program to count numbers of even and odd elements in an array   */



public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6}; // Example array
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements = " + evenCount);
        System.out.println("Number of odd elements = " + oddCount);
    }
}


/* output :

Number of even elements = 3
Number of odd elements = 2

*/