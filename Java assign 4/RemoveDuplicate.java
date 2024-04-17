/* 2.Write a Java program to remove duplicate characters from a string using StringBuffer. */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "ssssyyad";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

/* Output:

String after removing duplicates: syad 

*/
