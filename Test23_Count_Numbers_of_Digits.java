package com.core.basic_java_programs;

import java.util.Scanner;

public class Test23_Count_Numbers_of_Digits 
{
	public static void main(String[] args) 
	{
		int n, count=0;
		
		System.out.print("Enter any Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		while(n>0)
		{
			n = n/10;
			
			count++;
		}
		
		System.out.print("Number of Digits : " + count);sc.close();
	}

}

// Output:

/*

Enter any Number : 999
Number of Digits : 3


*/