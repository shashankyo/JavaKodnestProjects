package com.kodnest.Reverse;

public class Program {
public static void main(String[] args) {
	String str = "KNOWLEDGE";
//	char ch[] = str.toCharArray();
//	String a ="";
//	for(int i=str.length()-1;i>=0;i--)
//	{
//		a = a+ str.charAt(i);
//	}
//	System.out.println(a);
//	
	char ch[] = str.toCharArray();
	String a ="";
	for(int i=str.length()-5;i>=0;i--)
	{
		a = a+ str.charAt(i);
	}
//	System.out.println(a);
	String b = a;
	for(int i=5;i<str.length();i++)
	{
		b = b + str.charAt(i);
	}
	System.out.println(b);
}
}
