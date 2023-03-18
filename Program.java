package recursion;

public class Program {
public static void main(String[] args) {
	display(1);
}

private static void display(int i) {
	if (i==10)
		return;
	{
		System.out.println("Hello world");
		i++;
		display(i);
	}
	
}

}
