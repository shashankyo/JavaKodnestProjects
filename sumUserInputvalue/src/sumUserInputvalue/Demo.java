package sumUserInputvalue;

import java.util.Scanner;

public class Demo {
void sum()
{
	System.out.println("Enter the value till where sum is calculated");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int sum = 0;
	for(int i= 1;i <= num;i++)
	{
		sum = sum + i;
	}
	
	System.out.println("Sum is "+ sum);
}
}
