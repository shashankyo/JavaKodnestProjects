package weekdays;

import java.util.Scanner;

public class WeekApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the day to be printed:");
	int a = scan.nextInt();
Week w = new Week();
w.day( a);
}
}
