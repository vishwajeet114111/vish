package logicalProgramming;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		//1,3,5,7,11,13,17,19
		int a=4;
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("given number is not a prime number");
		}
		else
		{
			System.out.println("given number is a prime number");
		}

	}

}
