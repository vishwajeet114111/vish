package logicalProgramming;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) 
	{
		//10*5=10+10+10+10+10
		
		int a=10;
		int b=5;
		
		int sum=0;
		for(int i=1;i<=b;i++)
		{
			sum=sum+a;
		}
		System.out.println("multipation without operator is "+sum);
	}

}
