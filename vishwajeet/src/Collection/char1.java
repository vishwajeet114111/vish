package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class char1 {

	public static void main(String[] args) {

		ArrayList<Character>a1=new ArrayList<>();
		a1.add('A');
		a1.add('B');
		a1.add('C');
		a1.add('D');
		a1.add('E');
		
		//for(Character)
			
			
			
	ArrayList<Boolean>b1=new ArrayList<>();
	b1.add(true);
	b1.add(false);
	System.out.println(b1);
	
	System.out.println("===============================");
	System.out.println(b1.get(0));		
	System.out.println(b1.get(1));
	
	System.out.println("========USING listiterator============");
	ListIterator<Boolean> li = b1.listIterator();	
	
	
	
	while(li.next())
	{
		System.out.println(li.hasPrevious());
	}
			
	
			
			
			
			
			
//	ArrayList<String>a1=new ArrayList<>();
//	a1.add("vishwajeet");
//	a1.add("shivani");
//	a1.add("om");
//	a1.add("pranv");
//	
//	System.out.println(a1);
//	sys
			
	}

}
