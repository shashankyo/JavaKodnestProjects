package methodBasedonInputOutput;

import java.util.Scanner;

public class DemoApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Demo d  = new Demo();
	d.Add();
	d.Sub(50, 40);
	int res = d.Mul();
	System.out.println(res);
	int res1 = d.Div(10, 2);
	System.out.println(res1);
}
}
