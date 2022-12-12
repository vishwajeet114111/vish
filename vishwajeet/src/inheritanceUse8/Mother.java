package inheritanceUse8;

public class Mother extends GrandNani 
{public static void main(String[] args) 
{
	Mother m =new Mother();
	m.money();		 //mother property
	m.experience();  //grandnani property
	m.ajoba();		 //ajoba property
	
	// this are MULTI-LEVEL INHERITANCE
}

	public void money ()
	{
		System.out.println("money MOTHER");

	}

}
