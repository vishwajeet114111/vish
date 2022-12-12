package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
			HashSet h=new HashSet<>();
			
			h.add(100);
			h.add("velocity");
			h.add('A');
			h.add(100);
			h.add(45.8f);
			h.add(null);
			h.add(null);
			
			System.out.println(h);
			System.out.println(h.size());
			System.out.println(h.contains(null));
			System.out.println(h.isEmpty());
			System.out.println(h);
			System.out.println(h.remove(null));
			System.out.println(h);
			
			//for each
			System.out.println("======for each========");
			for(Object o:h)
			{
				System.out.println(o);
			}
			
			//iterator
			System.out.println("==========iterator============");
			
			Iterator it=h.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			h.clear();
			System.out.println(h);
			System.err.println(h.isEmpty());
			
	}

}
