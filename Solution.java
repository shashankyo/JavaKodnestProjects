package lengthOfStringWithoutInbuilt;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	char ch[] = str.toCharArray();
	int count = 0;
	for (char c :ch) {
	    count++;
	}
	System.out.println("length: " + count);
}
}
