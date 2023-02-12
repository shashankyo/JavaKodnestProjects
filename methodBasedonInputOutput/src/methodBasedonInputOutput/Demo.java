package methodBasedonInputOutput;

public class Demo {
void Add()
{
	int a= 10;
	int b= 20;
	int c = a + b;
	System.out.println("Sum is "+c);
}

void Sub(int a, int b)
{
	int d = a-b;
	System.out.println("Sub is "+d);
}
int Mul()
{
	int a = 10;
	int b = 20;
	int c = a*b;
	return c;
}
int Div(int a , int b)
{
	int c = a/b;
	return c;
}
}
