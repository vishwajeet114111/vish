package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashsetStudy {

	public static void main(String[] args) {
		 LinkedHashSet lh =new LinkedHashSet();
		 
		 lh.add('v');
		 lh.add("vish");
		 lh.add(null);
		 lh.add(100);
		 lh.add('A');
		 lh.add(78.6d);
		 lh.add(100);
		 
		 System.out.println(lh);
		 System.out.println(lh.isEmpty());
		 System.out.println(lh.size());
		 System.out.println(lh.contains('v'));
		 
		 lh.remove(100);
		 System.out.println(lh);
		
		 System.out.println("======for each=========");
		 for(Object o:lh)
		 {
			 System.out.println(o);
		 }


		 System.out.println("======iterator=========");
		 Iterator it =lh.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 

	}

}
