package exception;

public class tryCatchFinaly {

	public static void main(String[] args) 
	{			
			String a="abc";
			try 
			{
			System.out.println(a.charAt(10)); // risky code
			} 
			catch (NullPointerException e)
			{
			System.out.println("Check index, index should in betn 0-2");
			}
			finally
			{
				System.out.println("Finally block is running");
			}
			

	}

}
