/* 
2.	Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 10 which is completely divisible by sum of its digits.

Example :
Suppose a number 24 . Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.

*/


import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			sum+=temp%10;
			temp=temp/10;
			
			
		}
		if(num%sum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
		

	}

}



/* output:

Enter the number
24
Harshad Number

*/


