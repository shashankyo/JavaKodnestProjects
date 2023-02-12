package hakerrankStringUpper;

public class Solution {
public static void main(String[] args) {
	String A  = "hello";
	String B = "java";
	int length1 = A.length();
	int length2 = B.length();
	String str = "";
	String str1 = "";
	
	System.out.println(length1 + length2);
	
	if (A.compareTo(B)>0) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	for (int i=0;i<A.length();i++) {
		if(i==0)
		{
			char c = ((char)((int)A.charAt(0)-32));
			str = str + c;
			
			
		}
		else {
			str = str + A.charAt(i);
		}
	}
	for (int i=0;i<B.length();i++) {
		if(i==0)
		{
			char c = ((char)((int)B.charAt(0)-32));
			str1 = str1 + c;
			
		}
		else {
			str1 = str1 + B.charAt(i);
		}
	}
	System.out.println(str + " " + str1);
}
}
