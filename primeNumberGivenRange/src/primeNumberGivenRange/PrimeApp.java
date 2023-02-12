package primeNumberGivenRange;

import java.util.Scanner;

public class PrimeApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers to find prime number");
	int a = scan.nextInt();
	int b = scan.nextInt();
	Prime prime = new Prime();
	for(int i = a; i<=b;i++)
	{
		boolean res = prime.checkPrime(i);
		if (res == true)
		{
			System.out.println(i);
		}
	}
}
}
