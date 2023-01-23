package summation;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the length of the array");
	int length = scan.nextInt();
	int []arr = new int[length];
	System.out.println("enter the elements present in the array:");
	for (int i = 0; i<= arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	
	
	int mul = 1;
	for(int i=0;i<=arr.length-1;i++)
	{
		mul = mul * arr[i];
	}
	System.out.println("the ans is"+mul+"");
	
}
}
