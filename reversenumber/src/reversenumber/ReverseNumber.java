package reversenumber;

public class ReverseNumber {
static int reverseNumber(int num)
{
	int digit;
	int rev = 0;
	while(num !=0)
	{
		digit = num % 10;
		rev = rev * 10 + digit;
		num = num/10;
	}
	return rev;
}
}
