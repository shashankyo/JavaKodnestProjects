package calculatorproject;

public class CheckNumber {
	String checkNumberOdd(int num)
	{
		if (num % 2 == 0)
		{
			return "even";
		}
		else
		{
			return "odd";
		}
	}
	
	String checkPosNeg(int num)
	{
		if( num > 0)
		{
			return "positive";
		}
		else
		{
			return "negative";
		}
	}
}
