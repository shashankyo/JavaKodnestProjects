package execution;

import java.util.Scanner;

public class BikeApp {
public static void main(String []args)
{
	Bike b1 = new Bike();
	Bike b2 = new Bike();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter the engine number of bike 1");
	b1.enginenumber = scan.nextInt();
	System.out.println("enter the engine number of bike 2");
	b2.enginenumber = scan.nextInt();
	System.out.println("enter the brand name of bike 1");
	b1.brand = scan.next();
	System.out.println("enter the brand name of bike 2");
	b2.brand = scan.next();
	System.out.println("eng no of B1 IS\t" + b1.enginenumber);

	System.out.println("eng no of B2 IS\t" + b2.enginenumber);
	System.out.println("brandname B1 IS\t" + b1.brand);

	System.out.println("brand name B2 IS\t" + b2.brand);
}
}
