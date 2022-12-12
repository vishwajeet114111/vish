package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector<Object>v=new Vector<>();
		v.add("hi");
		v.add('m');
		v.add("vish");
		v.add('m');
		v.add(null);
		v.add(true);
		
		System.out.println(v);
		
		System.out.println(v.get(0));
		v.add(1, 'f');
		System.out.println(v);
		System.out.println(v.remove(1));
		System.out.println(v.contains("vidfmd"));
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		v.add("hii");
		v.add('f');
		v.add("vishwajeet");
		v.add('f');
		v.add(null);
		v.add(false);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		
		//for loop,for each,listIterator,enumeration
		System.out.println("=========for loop=============");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=========for each=============");
		
		for(Object c:v)
		{
			System.out.println(c);
		}
		System.out.println("=========Iterator=============");
		
		Iterator<Object> vt = v.iterator();
		while(vt.hasNext())
		{
			System.out.println(vt.next());
		}
		System.out.println("========listIterator=============");
		
		ListIterator<Object> vl = v.listIterator();
		while(vl.hasNext())
		{
			System.out.println(vl.next());
			
		}
		System.out.println("========Enumeration=============");
		Enumeration<Object> ve = v.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
