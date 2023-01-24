package poorneg;

import java.util.Scanner;


public class CheckNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scan.nextInt();
		CheckNUmber c = new CheckNUmber();
	c.compute( a);
	}
	}

