package logicalProgramming;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		//4!=4*3*2*1=24
		
		int a=4;
		int fact=1;
		for(int i=a;i>0;i--)
		{
			fact=fact*i;		
			System.out.println("factorial of "+a+"*"+i+" ="+fact);

			//1*4,4*3,12*2,24*1
		}
		System.out.println("factorial of "+a+" is "+fact);
		
	}

}
