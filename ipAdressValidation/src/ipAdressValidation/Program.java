package ipAdressValidation;

public class Program {
public static void main(String[] args) {
	boolean flag = true;
	int count = 0;
	String str = "124.92.84.44";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i) == '.')
		{
			count ++;
		}
	}
	if(count != 3)
	{
		flag = false;
	}
	String[] s = str.split("\\.");
	for(String s1:s)
	{
		int i = Integer.parseInt(s1);
		if(s1.length()>1 && s1.charAt(0) == '0')
		{
			flag = false;
			
		}
		if(i<0 || i>255)
		{
			flag = false;
		}
	}
	if(flag == true)
	{
		System.out.println("Valid I.P address");
	}
	else {
		System.out.println("Not a valid I.P address");
	}
}
}
