package hackerPallindrome;

import java.util.Scanner;

public class Solution {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String str ="kodnest";	        /* Enter your code here. Print output to STDOUT. */
	        StringBuilder str1 = new StringBuilder(str);
	        StringBuilder reverse = str1.reverse();
	        String string = reverse.toString();
	       
	        if(str.compareTo(string)==0)
	        {
	        	System.out.println("Yes");
	        }else{
	        	System.out.println("No");
	        }
	    }
	}

