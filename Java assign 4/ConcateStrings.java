/* Q.3 Write a Java program to concatenate all elements of a string array efficiently using StringBuilder. */

public class ConcatenateStrings {
    public static void main(String[] args) {
      
        String[] arr = {"Hello", "Saurabh"};
        
 
        StringBuilder sb = new StringBuilder();
      
        for (String str : arr) {
            sb.append(str);
        }

        String result = sb.toString();
        System.out.println(result);
    }
}

/* Output:

HelloSaurabh

*/