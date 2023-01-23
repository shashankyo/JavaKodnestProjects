package constructors;

public class Bike {
	String brand;
	int engNo;
	int cost;
	
	
	public Bike(String brand, int engNo, int cost)
	{
		this.brand = brand;
		this.engNo = engNo;
		this.cost = cost;
		
	}
	
	public String getBrand()
	{
		return brand;
		
	}
	
	public int getEngNo()
		{
			return engNo;
		}
	
	public int getCost()
	{
		return cost;
	}
}
