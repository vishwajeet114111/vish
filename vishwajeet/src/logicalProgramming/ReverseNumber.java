package logicalProgramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		//num=1234----->4321
		//int to string
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any int");
		int s1 = sc.nextInt();
//		System.out.println("give string is "+s1);
		 String oringal = Integer.toString(s1);
		 String rev="";
		 for(int i=oringal.length()-1;i>=0;i--)
		 {
			 char t = oringal.charAt(i);
			 rev=rev+t;
			 
		 }
		int w= Integer.parseInt(rev);
		System.out.println("rev num is "+w);
		
	}

}
