package staticblocks;

public class Program {

{
	System.out.println("first");
}

{
	System.out.println("second");
}

{
	System.out.println("third");
}
public static void main(String[] args) {
	System.out.println("inside main");
	Program p = new Program();
}
}
