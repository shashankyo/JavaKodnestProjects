package pallindromecheck;

import java.util.Scanner;

public class PallindromApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	Pallindrom p = new Pallindrom();
	int res = p.reverse(num);
	
	if(num == res )
	{
		System.out.println("Entered number is a Pallindrom");
	}
	else
	{
		System.out.println("Entered number is not a Pallindrome");
	}

}
}
