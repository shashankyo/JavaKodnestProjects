package heightofplayers;

import java.util.Scanner;

public class Player {
public static void main(String []args) 
{
	Scanner scan = new Scanner(System.in);
	int []arr = new int[8];
	for(int i=0; i<= arr.length-1; i++)
	{
		System.out.println("Enter the height for the "+(i+1)+"player");
		arr[i] = scan.nextInt();
	}
	for (int i=0; i<=arr.length-1; i++)
	{
		System.out.println("The height of the player"+(i+1)+" is");
		System.out.println(arr[i]);
	}
}
}
