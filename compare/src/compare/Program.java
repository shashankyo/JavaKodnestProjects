package compare;

public class Program {
public static void main(String []args) 
{
	String s1 = "SACHIN";
	String s2 = "SACHIN";
	if (s1.compareTo(s2)>0) {
		System.out.println("s1 is greater");
	}
	else if(s1.compareTo(s2)<0)
	{
		System.out.println("both are equal");
	}
}
}
