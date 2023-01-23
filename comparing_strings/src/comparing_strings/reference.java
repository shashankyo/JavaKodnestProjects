package comparing_strings;

public class reference {
			public static void main(String[] args)
			{
				String s1 = "kodnest";
				String s2 = new String ("kodnest");
				if(s1 == s2)
				{
					System.out.println("refrences are equal");
				}else {
					System.out.println("refrences are noy equal");
				}
			}
}
