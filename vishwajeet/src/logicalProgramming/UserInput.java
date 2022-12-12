package logicalProgramming;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		//int a=10;
		//int b=30;
		//int c=a+b;
		//System.out.println(c);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		int c =a+b;
		System.out.println("Addition is"+c);
	}

}
