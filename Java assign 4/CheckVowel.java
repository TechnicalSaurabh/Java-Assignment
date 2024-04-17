/* 8.Write a JAVA program to create a method that takes a string as input 
  and throws an exception if the string does not contain vowels. */

  package exception;
import java.util.*;
class NoVowels extends Exception{
public  NoVowels (String msg) {
super(msg);
}
}
public class CheckVowel {
public static void CheckVowel(String input)throws NoVowels{
boolean containsVowels=false;
String vowel="AEIOUaeiou";
for(int  i=0;i<input.length();i++)
{
char test=input.charAt(i);
if(vowel.contains(String.valueOf(test)))
{
containsVowels=true;
break;
}
}
if(!containsVowels) {
throw new NoVowels("The string does not contains any vowels");
}
}
public static void main(String[] args) {
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
try {
String in=sc.next();
CheckVowel(in);
System.out.println("The string contains vowels...");
}catch(NoVowels e) {
System.out.println(e.getMessage());
}
}

}

/* Output:
Enter the string
saurabh
The string contains vowels...

Enter the string
yycb
The string does not contains any vowels

*/
