package multiplication;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int length = scan.nextInt();
	int []arr = new int[length];
	System.out.println("Enter the array elements");
	for( int i=0; i<=arr.length-1;i++)
	{
		arr[i] = scan.nextInt();
	}
	int sum = 0;
	for(int i= 0; i<= arr.length-1;i++)
	{
		sum = sum + arr[i];
	}
	System.out.println("The Summation of the array elemets are " + sum +"");
}
}
