package calculatorproj;

import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	int calculate() {
		System.out.println("Division activity is started");
		System.out.println("enter the first number");
		int a = scan.nextInt();
		System.out.println("enter the second number");
		int b = scan.nextInt();
		return a/b;
		
	}
	int calculate (int a) {
		System.out.println("multiplication activity is started");
		System.out.println("enter the first number");
		int b = scan.nextInt();
		return (a*b);
	}
	int calculate(int a, int b)
	{
		System.out.println("substrction method is started");
		return (a - b);
	}
	
	int calculate(int a, int b, int c)
	{
		System.out.println("addition activity has started");
		return (a+b+c);
	}
	
}
