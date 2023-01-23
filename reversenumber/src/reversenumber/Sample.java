package reversenumber;

import java.util.Scanner;

public class Sample {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	int rev = ReverseNumber.reverseNumber(num);
	System.out.println("Reversed number is");
	System.out.println(rev);
}
}
