package factorialwithRec;

public class Solution {
public static void main(String[] args) {
	int factorial = 0;
	System.out.println(factorial(6));
}

private static int factorial(int n) {
	return (n==0)?1:(n * factorial(n-1));
}
}
