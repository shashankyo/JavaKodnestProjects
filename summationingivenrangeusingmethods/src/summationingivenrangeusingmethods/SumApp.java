package summationingivenrangeusingmethods;

import java.util.Scanner;

public class SumApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers to find sum in given range");
	int x = scan.nextInt();
	int y = scan.nextInt();
	FindSum fs = new FindSum();
	int result = fs.Sum(x, y);
	System.out.println("Sum is " + result);
}
}
