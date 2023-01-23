package TOkeniser;

import java.util.StringTokenizer;

public class Mprogram {
public static void main(String []args) 

{
	StringTokenizer st = new StringTokenizer("javasqlapti ","");
	while(st.hasMoreTokens() == true)
	{
		System.out.println(st.nextToken());
	}
	
}
}
