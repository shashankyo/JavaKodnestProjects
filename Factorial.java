package factorialOfNumber;

public class Factorial {
static int factorial(int n)
{
	int fact = 1;
	for( int i=1;i<=n;i++)
	{
		fact = fact * i;
	}
	return fact;
}
}
