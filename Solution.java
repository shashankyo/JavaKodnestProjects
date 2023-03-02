package sortWordsinSentence;

import java.util.Arrays;

public class Solution {
public static void main(String[] args) {
	String str = "sentence";
	char []ch =str.toCharArray();
//	Arrays.sort(ch);
//	for(char i : ch)
//	{
//		System.out.println(i);
//	}
	char temp;
	for (int i = 0;i<ch.length;i++)
	{
		for(int j = i+1; j< ch.length;j++){
			if (ch[i] > ch [j])
			{
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
			}
		}
	}
	for (char c : ch){
		System.out.println(c);
	}
}
}
