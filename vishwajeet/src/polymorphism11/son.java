package polymorphism11;

public class son extends father{

	public static void main(String[] args) {
		father f = new father();
		son s = new son();
		
		f.nature();
		s.nature();
		
		
		
	}
	public void nature()
	{
		System.out.println("son nature");
		
	}
	public static void test()
	{
		System.out.println("Test son method");
	}

}
