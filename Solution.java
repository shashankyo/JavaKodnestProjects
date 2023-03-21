package occurenceOfEachLetter;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
	 String x;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a string");
	    x = input.nextLine();
	    x = x.toUpperCase();
	    int size = x.length();
	    for(int i =0;i<size;i++) {
	        int count=1;
	        char find = x.charAt(i);

	        for(int j=i+1;j<size;j++) {
	            if(find == x.charAt(j)) {
	                count++;
	            }
	        }

	        System.out.printf("%c\t%d",x.charAt(i),count);
	        System.out.println();       
	    }
}
}