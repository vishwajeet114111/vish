package thisAndSuperKeyword10;

public class ThisUse {
	int a=40;//global variable
	int b=20;

	public static void main(String[] args) 
	{
		ThisUse tu = new ThisUse();
		tu.add();
	}
	
	public void add()
	{
		int a=10;//local variable
		int sum = 90+a;
		System.out.println("sum is "+sum);
		
		int sum1 = this.a+this.b;
		System.out.println("sum is "+sum1);
		System.out.println("this is global int a "+this.a);
	}

}
