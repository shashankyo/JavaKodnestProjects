package calculatorproj;

import java.util.Scanner;

public class CalculatorApp {
public static void main(String []args) 

{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	Calculator calci = new Calculator();
	System.out.println(calci.calculate());
	System.out.println(calci.calculate(a));
	System.out.println(calci.calculate(a,b));
	System.out.println(calci.calculate(a,b,c));
}
}
