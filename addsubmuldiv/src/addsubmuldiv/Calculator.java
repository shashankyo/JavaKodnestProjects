package addsubmuldiv;

public class Calculator
{
	void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
	
	int mul () {
		int a= 10;
		int b= 20;
		int c = a*b;
		return c;
	}
	
	int div (int a, int b) {
		int c = a/b;
		return c;
	}

}
