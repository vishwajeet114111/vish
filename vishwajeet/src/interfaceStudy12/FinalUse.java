package interfaceStudy12;

public class FinalUse {// class is final we can't extend class.

	public static void main(String[] args) {
		
		final int a=20;
		//a=a+1;if variable is final,we can't re-initialize that variable.
		
		System.out.println(a);
		
		FinalUse f= new FinalUse();
		f.test();
	
	}

	protected final void test()
	//if method is a final we can't override that method.
	{
		System.out.println("test method");
	}
}
