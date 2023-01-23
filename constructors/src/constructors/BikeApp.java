package constructors;

public class BikeApp {
public static void main(String []args) 
{
	Bike b1 = new Bike("shashank", 23, 78);
	System.out.println(b1.getBrand());
	System.out.println(b1.getEngNo());
	System.out.println(b1.getCost());
	
}
}
