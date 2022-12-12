package conditionalStatement6;

public class ElseIfUse {

	public static void main(String[] args) 
	{
		//if marks greater than or equals 75 --> I am in Dist
		//else if marks greater than or equals 66--> I am in 1st class
		//else if marks greater than or equals 50--> I am in 2nd class
		//else if my marks greater than equals to 40 then I am just pass 
		//else I am fail
		
		int marks = 50;
		if (marks >=75)
		{
			System.out.println("distincation");
		}
		else if (marks >= 65)
		{
			System.out.println("first class");
		}
		else if (marks >=50)
		{
			System.out.println("second class");
		}
		else if (marks >=30)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("enter the valid number");
		}

	}

}
