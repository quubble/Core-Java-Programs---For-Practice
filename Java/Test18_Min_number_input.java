// Find Minimum number between two Numbers by taking User Input
package com.core.basic_java_programs;

import java.util.Scanner;

public class Test18_Min_number_input 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		System.out.print("Enter two Numbers : ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		if (a < b) 
		{
			System.out.println(a);
		} 
		else 
		{
			System.out.println(b);sc.close();
		}
		
	}

}


/* Output:
 
Enter two Numbers : 50 100
50

*/