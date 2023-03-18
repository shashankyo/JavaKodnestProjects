package recursionExitzero;

public class Solution {
	static int count = 0;
public static void main(String[] args) {
	
	display();
}

private static void display() {
	
	count ++;
	if(count <= 5)
	{
		System.out.println("Hello Weekend");
		display();
		;
	}
	else
	{
		System.exit(0);
	}
	
}
}
