package logicalProgramming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s1 = sc.next();
		System.out.println("given string is "+s1);
		String reverse="";
		//vishwajeet
		//0123456789
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ca = s1.charAt(i);
			reverse=reverse+ca;
		}
		System.out.println("reverse string is "+reverse);
		
		
	}

}
