package smallestoftwonumbers;

import java.util.Scanner;

public class SmallApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int a = scan.nextInt();
	System.out.println("Enter the second number:");
	int b = scan.nextInt();
	
Small s = new Small();
s.compute( a, b);
}
}
