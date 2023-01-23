package looping;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the length of the array");
	int length = scan.nextInt();
	System.out.println("enter the number");

	int []arr = new int[length];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i] = scan.nextInt();	
	}
	System.out.println("The array elements are:");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
