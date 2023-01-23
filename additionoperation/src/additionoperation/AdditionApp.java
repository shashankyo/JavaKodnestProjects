package additionoperation;

public class AdditionApp {

	public static void main(String []args) 
	{
		int a = 10, b = 20, c = 30;
		float p = 10.5f, q =20.5f, r =30.5f;
		Addition m = new Addition();
		System.out.println(m.add(a,b));
		System.out.println(m.add(a,b,c));
		System.out.println(m.add(a,q,r));

		}
}
