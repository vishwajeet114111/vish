package logicalProgramming;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int s1 = sc.nextInt();
		if(s1==0)
		{
			System.out.println(s1+" is neither odd nor even ");
		}
		else if(s1%2==0)
		{
			System.out.println(s1+" is even number");
		}
		else
		{
			System.out.println(s1+" is odd number");		}
	}

}
