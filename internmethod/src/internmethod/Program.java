package internmethod;

public class Program {
	public static void main(String []args)
	{
		String s1 = "kodnest";
		String s2 = new String("kodnest");
		String s3 = s2.intern();
		if (s1 == s3)
		{
			System.out.println("references are equal");	
		}else {
			System.out.println("references are not equal");		
		}
	}
	}
