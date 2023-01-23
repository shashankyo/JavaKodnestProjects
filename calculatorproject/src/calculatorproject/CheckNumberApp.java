package calculatorproject;

import java.util.Scanner;

public class CheckNumberApp {
public static void main(String []args)
{
	CheckNumber cn = new CheckNumber();
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int num = scan.nextInt();
	System.out.println(cn.checkNumberOdd(num));
	System.out.println(cn.checkPosNeg(num));
}
}
          