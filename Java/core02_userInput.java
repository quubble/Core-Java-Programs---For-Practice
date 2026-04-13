package com.core.basic_java_programs;

import java.util.Scanner;

public class core02_userInput {
    public static void main(String[] args) 
	{
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Value : ");
		
		a = sc.nextInt();
		
		System.out.println(a);sc.close();
		
	
	}
}
