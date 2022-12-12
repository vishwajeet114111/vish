package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList<Object> ll = new LinkedList<>();
		ll.add("velocity");
		ll.add("velocity");
		ll.add("1234");
		ll.add("velo");
		ll.add("city");
		ll.add(null);
		ll.add(true);
		ll.add(false);
	
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(null));
		
		System.out.println(ll.element());
		System.out.println(ll);
		
		System.out.println(ll.get(4));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.offerFirst("pune"));
		System.out.println(ll);
		
		System.out.println(ll.offerLast("mh"));
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		
		System.out.println(ll.set(3, "velocity"));
		System.out.println(ll);
		
		System.out.println("===for loop====");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("====for each=====");
		for(Object a:ll)
		{
			System.out.println(a);
		}
		System.out.println("====iterator====");
		
		Iterator<Object> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====list iterator====");
		
		ListIterator<Object> li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}
