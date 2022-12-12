package assignment;

public class PraCons 
{
	int a;
	int b;
	int c;
	
	public PraCons()
	{
	    a=20;
		b=20;
		System.out.println("user defined method without para");
	}
	public PraCons (int num1)
	{
		a = num1;
		System.out.println("user defined method with one para");
	}
	public PraCons (int num1,int num2)
	{
		a = num1;
		b  = num2;
		System.out.println("user defined method with two para");
	}
	public PraCons (int num1,int num2,int num3)
	{
		a = num1;
		b = num2;
		c = num3;
		System.out.println("user defined method with three para");
	}
	
	public static void main(String[] args) 
	{
		PraCons PC = new PraCons();
		PC.add();
		PraCons PC1 = new PraCons(20);
		PC1.add();
		PraCons PC2 = new PraCons(20,20);
		PC2.add();
		PraCons PC3 = new PraCons(20,20,20);
		PC3.add();
	}
	public void add()
	{
		c=a+b;
		System.out.println("addais "+c);
	}
}