package exception;

public class ArithMathicTest {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try 
		{
		System.out.println(a/b);	
		}
//		catch (ArithmeticException e) 
//		{
//			System.out.println(e);
//		}
		catch (Exception e) 
		{
		System.out.println("can't divided by zero");
		e.printStackTrace();
		}
		
	
	}

}
