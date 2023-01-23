package squareornot;

import java.util.Scanner;

public class SquareApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of the side:");
	int l = scan.nextInt();
	System.out.println("Enter the breadth of the side:");
	int b = scan.nextInt();
	
Square s = new Square();
s.calculate( l,  b);
}
}
