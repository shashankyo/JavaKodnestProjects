package swapFirstLast;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("ENter a string");
	Scanner scan =  new Scanner(System.in);
	String str = scan.next();
	char ch[] = str.toCharArray();
	char temp =ch[0];
	ch[0] = ch[ch.length-1];
	ch[ch.length-1] = temp;
	System.out.println(ch);
}
}
