package suminGivenRange;

import java.util.Scanner;

public class ProgramApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number from where summation starts");
	int a = scan.nextInt();
	System.out.println("Enter the range till where summation has to be done");
	int b = scan.nextInt();
	int sum = 0;
	for(int i = a;i<=b;i++)
	{
		sum = sum + i;
	}
	System.out.println("Sum of given range of numbers is  "+ sum);
}
}
