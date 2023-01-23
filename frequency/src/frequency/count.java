package frequency;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	int length= scan.nextInt();
	char arr[] =  new char[length];
	System.out.println("Enter the array elements:");
	int count = 0;
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i] = scan.next().charAt(0);
	}
	System.out.println("Enter the array elements to count for:");
	char key = scan.next().charAt(0);
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i] == key )
		{
			count ++;
		}
	}
	System.out.println("Count is:"+count);
	
}
}
