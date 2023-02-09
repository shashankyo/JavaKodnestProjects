package sumofgivenNumber;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to find the sum of digit");
	int num = scan.nextInt();
	Sum sum = new Sum();
	int res = sum.findSum(num);
	System.out.println("Sum of digit of number "+ num+ " is "+res);

}
}
