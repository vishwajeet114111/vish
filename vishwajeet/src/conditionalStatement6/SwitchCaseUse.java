package conditionalStatement6;

public class SwitchCaseUse {

	public static void main(String[] args) 
	{
		//Please insert year
		// 1. If Year is 1-->Welcome to 1st Year Engg
		// 2. If Year is 2-->Welcome to 2nd Year Engg
		// 3. If Year is 3-->Welcome to 3rd Year Engg
		// 4. If Year is 4-->Welcome to 4th Year Engg
		// 5. If value is not between 1-4, please enter correct value between 1-4

		int year =1;
		switch (year)
		{
		case 1:
			System.out.println("Welcome to 1st Year Engg");
		break;
		case 2:
			System.out.println("Welcome to 2nd Year Engg");
		break;
		case 3:
	    	System.out.println("Welcome to 3rd Year Engg");
	    break;
		case 4:
			System.out.println("Welcome to 4th Year Engg");
	    break;
	    default: 
	    	System.out.println("enter valid num");
	    break;
	}
}
}
