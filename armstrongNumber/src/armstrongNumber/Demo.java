package armstrongNumber;

public class Demo {
static int getCount(int num)
{
	int count = 0;
	while(num != 0)
	{
		int digit = num % 10;
		count ++;
		num = num / 10;
		
	}
	return count ;
}
}
