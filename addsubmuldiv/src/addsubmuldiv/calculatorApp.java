package addsubmuldiv;

public class calculatorApp {
public static void main(String []args)
{
	Calculator calc = new Calculator();
	calc.add();
	calc.sub(10, 20);
	System.out.println(calc.mul());
	System.out.println(calc.div(20, 5));
}
}
