package leapYearSubQuestion;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Enter the year");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	boolean flag = false;
//	if(n%400==0 && (n % 100!=0 || n% 4 == 0))
//	{
//		System.out.println("Leap year");
//	}else {
//		System.out.println("Not a leap year");
//	}
	if(n % 400 == 0)
	{
		if(n % 100 == 0)
		{
			if(n % 4 == 0)
			{
				flag = true;
			}else {
				flag = false;
			}
		}
	}else {
		flag = false;
	}
	if(flag)
	{
		System.out.println("leap");
	}else {
		System.out.println("not a leap");
	}
}
}
