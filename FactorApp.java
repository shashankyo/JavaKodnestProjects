package factorofTen;

import java.util.Scanner;

public class FactorApp {
public static void main(String[] args) {
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter a number to check whethe it is a factor of 10 or not");
	int num = scan.nextInt();
	boolean res = Factor.factor(num);
	if (res == true)
	{
		System.out.println("Entered Number "+ num+ " is the factor of 10");
	}
	else
	{
		System.out.println("Entered Number "+num+ " is not a factor of 10");
	}
}
}
