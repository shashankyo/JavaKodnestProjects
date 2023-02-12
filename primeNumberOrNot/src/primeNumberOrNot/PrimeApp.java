package primeNumberOrNot;

import java.util.Scanner;

public class PrimeApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to check whether it is prime or not");
	int number = scan.nextInt();
	Prime p = new Prime();
	boolean b = p.isPrime(number);
	if(b == true)
	{
		System.out.println("Entered number "+number+ " is a Prime number");
	}
	else
	{
		System.out.println("Entered number "+ number+ " is not a prime number");
	}
}
}
