package conditionalStatement6;

public class NestedIfUse {

	public static void main(String[] args) 
	{
		//EnterUserID-->if userID is correct then-->Enter Password
		//if Password is correct then-->the Welcome to Home Page, else incorrect Password
		//else incorrect user ID

		String UID ="pranav";
		String PWD ="chalse";
		if (UID == "pranav")
		{
			System.out.println("UID correct, go for PWD");
		if (PWD=="chalse")
		{
			System.out.println("PWD is correct");
		}
		else
		{
			System.out.println("plz enter correct PWD");
		}
	}
		else
		{
			System.out.println("plz enter valid UID");
		}
	}
}
