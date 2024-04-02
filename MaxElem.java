public class MaxElem {
     public static void main(String[] args)
 {
 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 int max = arr[0];
 for (int i = 1; i < arr.length; i++)
 {
 if (arr[i] > max)
 {
 max = arr[i];
 }
 }
 double sum = 0;
 for (int i = 0; i < arr.length; i++)
 {
 sum += arr[i];
 }
 double avg = sum / arr.length;
 System.out.println("Maximum Element: " + max);
 System.out.println("Average of Elements: " + avg);
 }

}
