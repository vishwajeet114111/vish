package generalization16;

public class BOI implements RBI1 {

	@Override
	public void deposite() 
	{
		System.out.println("BOI's deposite system");	
	}

	@Override
	public void withdraw() 
	{
		System.out.println("BOI's withdraw system");
		
	}

	@Override
	public void loan() 
	{
		System.out.println("BOI's loan system ");
		
	}

	@Override
	public void transfer() {
		System.out.println("BOI's transfer system");
		
	}
	public void starApp()
	{
		System.out.println("BOI own facility starApp");
	}

}
