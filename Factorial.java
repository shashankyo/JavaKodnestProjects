package factorialofaLargerNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("Enter the number to find factorial");
	Scanner scan  = new Scanner(System.in);
	int number = scan.nextInt();
	BigInteger fact = BigInteger.ONE;
	for(int i=1;i<=number;i++)
	{
		fact = fact.multiply(BigInteger.valueOf(i));
	}
	System.out.println(fact);
}
}
