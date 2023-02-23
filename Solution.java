package hackeranagram;

import java.util.Arrays;

public class Solution {
public static void main(String[] args) {
	boolean flag = true;
	String str1 = "earth";
	char[] charArray = str1.toCharArray();
	Arrays.sort(charArray);

	
	String str2 = "na";
	char[] charArray2 = str2.toCharArray();
	Arrays.sort(charArray2);
	
	flag = true;
	if (charArray.length == charArray2.length)
	{
		for(int i=0;i<str1.length();i++)
			{
			if(charArray[i]!=charArray2[i])
			{
				flag = false;
			}
		}
	}
	if(flag == true)
	{
		System.out.println("Anagram");
	}else{
		System.out.println("Not a Anagram");
	}
}
}
