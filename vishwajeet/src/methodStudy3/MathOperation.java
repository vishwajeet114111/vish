package methodStudy3;

public class MathOperation {

	public static void main(String[] args) {
		//call static method without parameters & with parameter same class
		add();
		add(21, 230);
		
		//call static method without parameters other class
		RegularMethods.add();
		
		//call non static method without parameters & with parameter same class
		MathOperation mo =new MathOperation();//create object
		mo.sub();
		mo.mul(23, 10);
		mo.div(100, 5.0f);
		
		//call non static method without parameters other class
		RegularMethods rm =new RegularMethods();
		rm.sub();
		
		
		
		
	}
	public static void add()   //static method without parameters 
	{
	 int a=90;
	 int b=80;
	 int sum=a+b;
	 System.out.println("Addition is "+sum);
	}

	public static void add(int c,int d)//static method with parameter
	{
	 int sum =c+d;
	 System.out.println("additon is with parameter is "+sum);
	}
	public void sub()		//non static method without parameters
	{	int x=29;
		int y=34;
		int sub=y-x;
		System.out.println("sub is "+sub);	
	}
	public void mul(int s,int r)		//non static method with parameters
	{	int mul=s*r;
		System.out.println("multiption is "+mul);
	}
	public void div(int k,float l)
	{	float div=k/l;
	 System.out.println("div is "+div);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	










}
