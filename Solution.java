package sumofDiagonalMatrix;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
    int i,j,x,y,sum=0;
	System.out.println("Enter the number of rows:");
	x = scan.nextInt();
	System.out.println("Enter the number of columns:");
	y = scan.nextInt();
	
	int[][] mat = new int[x][y];

	System.out.println("Enter the elements of the matrix") ;
	for(i=0;i<x;i++)
	{ 
		for(j=0;j<y;j++)
		{ 
    		mat[i][j] = scan.nextInt();
		}
	}

	System.out.println("The elements of the matrix") ;
	for(i=0;i<x;i++)
	{ 
		for(j=0;j<y;j++)
		{ 
   	 		System.out.print(mat[i][j]);
		}
	 		System.out.println("");
	}

	for(i=0;i<x;i++)
	{ 
		for(j=0;j<y;j++)
		{
		if(i==j)	
		{
			sum = sum + mat[i][j];
		}
		}
	}

	System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
}	
}