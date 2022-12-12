package generalization16;

public class SBI implements RBI1
{
	@Override
	public void deposite() 
	{
		System.out.println("SBI's deposite system");	
	}

	@Override
	public void withdraw() 
	{
		System.out.println("SBI's withdraw system");
		
	}

	@Override
	public void loan() 
	{
		System.out.println("SBI's loan system ");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI's transfer system");
		
	}
	public void yono()
	{
		System.out.println("SBI own facility YONO");
	}

}
