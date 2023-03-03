package divisorSum;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int sum = 0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			sum = sum + i;
		}
	}
	System.out.println("sum is "+sum);
}
}
