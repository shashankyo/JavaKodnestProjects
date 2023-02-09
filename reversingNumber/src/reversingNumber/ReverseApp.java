package reversingNumber;

import java.util.Scanner;

public class ReverseApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to reverse");
	int num = scan.nextInt();
	Reverse r = new Reverse();
	int res = r.reverse(num);
	System.out.println("Reversed num is"+res);
}
}
