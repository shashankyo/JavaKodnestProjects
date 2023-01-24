package readname;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
	
System.out.println("Enter your name");
Scanner scan = new Scanner(System.in);
String a = scan.next();
System.out.println("name is "+ a);
System.out.println("haha");


//using new keyword
String str = new String("hero");
System.out.println(str);

//using string builder
StringBuffer str2 =  new StringBuffer("kodnest");
System.out.println(str2);

//string buffer
StringBuilder str3 = new StringBuilder("techfirm");
System.out.println(str3);

char c = 'h';
System.out.println(c);


char ch[] = {'k','o'};
System.out.println(ch);

String sw[] = {"hah","lala"};
System.out.println(sw[0]);
//System.out.println((sw.length[1]));

	
	
	String s1 = new String("shashank");
	System.out.println(s1.length());
	
	String k =  "";
	System.out.println(k.length());
	
	
	
	char mh[] = {'"','"'};
	System.out.println(mh);
	
	
	char w = 34;
	char x = 34;
	System.out.println(w+""+x);
//	System.out.println(w+""+x);

}
}
