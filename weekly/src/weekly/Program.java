package weekly;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = scan.nextInt();
	switch(num)
	{
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
	case 3:
		System.out.println("tuesday");
		break;
	case 4:
		System.out.println("wednesday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("saturday");
		break;
	default:
		System.out.println("invalid no enter a proper value");
	}
	
}
}
