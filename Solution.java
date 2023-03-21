package driveStars;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Please enter the number");
	Scanner scan = new Scanner(System.in);
//	int number = scan.nextInt();
//	int a[n] = scan.nextInt;
	int a[] = {10,5,20,20,4,5,2,25,1};
	int min = a[0];
	int max = a[0];
	int mincount = 0;
	int maxcount =0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i] < min)
		{
			min = a[i];
			mincount++;
		}
		if(a[i] > max)
		{
			max = a[i];
			maxcount++;
		}
	}
	System.out.println(mincount);
	System.out.println(maxcount);
}
}
