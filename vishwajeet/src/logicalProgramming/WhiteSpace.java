package logicalProgramming;
public class WhiteSpace {

	public static void main(String[] args) {

		String s="P u n e";
		char space=' ';
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==space)
			{
				count++;
			}
			
			
		}
		
		System.out.println("given string is "+s);
		System.out.println("numbr of blank spaces are "+count);
		
	}

}
