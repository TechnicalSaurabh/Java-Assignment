/* 4.Write a Java method to check if an input string is a palindrome (Use String functions). */
public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String str = "radar";
        boolean isPalindrome = checker.isPalindrome(str);
        System.out.println(str + " is a palindrome: " + isPalindrome);
    }
}

/*Output:

radar is a palindrome: true

*/
