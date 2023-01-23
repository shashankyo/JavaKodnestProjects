package stringop;

public class Program {
public static void main(String []args)
{
	String s1 = "kodnest";
	String s2 = "kodnest";
	if (s1 == s2)
	{
		System.out.println("references are equal");
	}
	else {
		System.out.println("references are not equal");
	}
	
	
	String s3 = "kodnest";
	String s4 = "kodnest";
	if (s3.equals(s4))
			{
		System.out.println("values are equal");
			}
	else
	{
		System.out.println("values are not equal");
	}
	
	String s5 = "kodnest";
	String s6 = "technology";
	if(s5 ==s6)
	{
		System.out.println("references are equal");
	}
	else 
	{
		System.out.println("references are not equal");
	}
	
	String s7 = new String("kodnest");
	String s8 = new String("bodmas");
	if (s7.equals(s8))
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not eaqual");
	}
	String s9 = "kodnest";
	String s10 = new String("kodnest");
	if(s9 == s10)
	{
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("references are not equal");
	}
	String s11 = "kodnest";
	String s12 = new String("kodnest");
	if(s11.equals(s12))
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not equal");
	}
	String s13= "KODNEST";
	String s14 = "kodnest";
	if(s13.equals(s14))
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not equal");
	}
	
	String s15 = "KODNEST";
	String s16 = "kodnest";
	if(s15.equalsIgnoreCase(s16))
	{
		System.out.println("values are equal after ignoring their case");
		
	}
	else
	{
		System.out.println("values are not equal");
	}
	String s17 = "kodnest";
	System.out.println(s17);
	String s18 = "technology";
	s18 = s17.concat(s18);
	System.out.println(s18);
	
	
	String s19 = "kodnest";
	String s20 = "kodnest";
	String s21 = "kod" + "nest";
	String s22 = "kod" + "nest";
	if(s21 == s22)
	{
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("references are not equal");
	}
	if(s21.equals(s22))
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not equal");
	}

}
}
