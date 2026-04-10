package com.core.basic_java_programs;

import java.util.Scanner;

public class Test7_Natural_Number_sum 
{
	public static void main(String[] args) 
	{
		int n, sum = 0;
		
		System.out.print("Enter Number :");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();		
		
		for (int i = 1; i <= n; i++) 
		{
			sum = sum + i;
			
		}
		System.out.print("Addition "+ sum);sc.close();
	}

}


/* Output:
 
 
 Enter Number : 10
Addition 55
 
 
 
 */