package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	{
		TreeSet<Object> ts=new TreeSet<>();
		
		ts.add(7);
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(3);
		ts.add(4);
		ts.add(6);
		
		//ts.add(null);
		//ts.add("pune");
		
		System.out.println(ts);
		System.out.println(ts.contains(6));
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println(ts.floor(3));
		System.out.println(ts.higher(6));
		System.out.println(ts.lower(4));
		
		System.out.println(ts.pollFirst());
	System.out.println(ts.pollLast());
		System.out.println(ts.isEmpty());
	

		
		//for each
		System.out.println("=======for each========");
		for(Object o:ts)
		{
			System.out.println(o);
		}
		
		//iterator
		System.out.println("========iterator========");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
