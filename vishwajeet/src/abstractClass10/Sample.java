package abstractClass10;

public abstract class Sample 
{
	public static void main(String[] args) 
	{
		/*Sample s =new Sample();
		s.add();*/
		
	}
	public void add()		//complete method
	{
		int a=10;
		int b=50;
		int c=a+b;
		System.out.println("this method is subtraction method " +c);
	}
	public abstract void sub();//incomplete method


}