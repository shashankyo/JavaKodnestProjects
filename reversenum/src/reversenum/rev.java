package reversenum;

import java.util.Scanner;

public class rev {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int n = scan.nextInt();
		int rev = 0;
		int d = 0;
		while(n !=0 )
		{
			d = n%10 ;
			
			rev = rev *10 + d;
			
			n= n/10;
		}
		System.out.println("reversed no is"+rev);
	}
}
