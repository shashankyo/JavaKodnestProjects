package reversingNumber;

public class Reverse {
int reverse(int num)
{
	int rev = 0 ;
	int digit = 0;
	while(num != 0)
	{
		digit = num % 10;
		rev = rev * 10 + digit;
		num = num / 10;
		
	}
	return rev;
}
}
