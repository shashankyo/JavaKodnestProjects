package factorialOfNumber;

import java.util.Scanner;

public class FactorialApp {
public static void main(String[] args) {
	Scanner scan  =new Scanner(System.in);
	System.out.println("Enter number to find the factorial");
	int n = scan.nextInt();
	int res = Factorial.factorial(n);
	System.out.println("Factorial of given number is "+res);
}
}
