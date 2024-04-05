/* 4.	Java Program for Sorting first half in Ascending order and second half in Descending order
Example
Input : arr[6] = [1, 90, 34, 89, 7, 9]
Output : 1 7 9 90 89 34

*/


import java.util.Arrays;
public class AscDescSort {
    public static void main(String[] args) {
        int[] arr = {1, 90, 34, 89, 7, 9};
        int n = arr.length;

        // Sort the entire array in ascending order
        Arrays.sort(arr);

        // Reverse the second half of the array to get it in descending order
        for (int i = n / 2; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*  output :

1 7 9 90 89 34 

*/