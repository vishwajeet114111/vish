package ArrayStudy18;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		char [] grade = {'A','X','B','Y','C','Z','D'};
		System.out.println("===USE dynamic loop====");
		//USE OF DYNAMIC FOR LOOP
		
		for(int a=0; a<=6;a++)
		{
			System.out.println(grade[a]);
		}
		System.out.println("===USEING SORT METHOD====");
		
		//USEING SORT METHOD
		Arrays.sort(grade);
		for(int a=0;a<=grade.length-1;a++ )
		{System.out.println(grade[a]);}
		System.out.println("===SORTED & REVERSE ORDER====");
		//SORTED & REVERSE ORDER
		
		for(int a=grade.length-1;a>=0;a--)
		{
			System.out.println(grade[a]);
		}

	}

}
