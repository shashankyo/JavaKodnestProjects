package hackerRankBiginteger;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number-1");
	BigDecimal a = scan.nextBigDecimal();
	System.out.println(a);
	
	System.out.println("Enter number-2");
	BigDecimal b = scan.nextBigDecimal();
	System.out.println(b);
	System.out.println(a.add(b));
	System.out.println(a.multiply(b));
}
}
