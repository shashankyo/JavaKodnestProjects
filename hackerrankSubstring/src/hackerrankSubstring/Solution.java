package hackerrankSubstring;

public class Solution {
public static void main(String[] args) {
	String str = "malayalam";
	
	StringBuilder s = new StringBuilder(str);
	StringBuilder reverse = s.reverse();
	String s1 = new String(reverse);
	if(str.equals(s1)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
}
}
