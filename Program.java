package standardCode;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	System.out.println("Enter array length");
	Scanner scan  = new Scanner(System.in);
	int n = scan.nextInt();
	int array[] = new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<array.length;i++)
	{
		 array[i] = scan.nextInt(); 
	}
	System.out.println("Entered array elements are:");
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	scan.close();
}
}
