package exception;

public class NullPointException {

	public static void main(String[] args) 
	{
		String a="hi";
		String b=null;
		
		try 
		{
			System.out.println(a.charAt(20));
		} 
		catch (Exception e) 
		{
			System.out.println("a is null");
			e.printStackTrace();
		}
		System.out.println("hi......");
	}

}
