import java.util.*;
class Number
{
	public static void main(String args[])
	{
		int arr[] = { 11, 13, 26, 10, 28, 1 };
		int n = arr.length;
                int k=2;
		Arrays.sort(arr);
System.out.println("second maximum element is " + arr[n-k]);
System.out.println("second minimum element is " + arr[k-1]);
	}
}
