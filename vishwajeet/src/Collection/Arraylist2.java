package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) 
	{
		ArrayList<Double>d1=new ArrayList<>();
		d1.add(12.22d);
		d1.add(22.22d);
		d1.add(32.22d);
		d1.add(42.22d);
		d1.add(52.22d);
		System.out.println(d1);
		System.out.println("===========");
		
		System.out.println(d1.get(0));
		System.out.println(d1.get(1));
		System.out.println(d1.get(2));
		System.out.println(d1.get(3));
		System.out.println(d1.get(4));
		System.out.println("===using for loop each===");
		
		 for(double vish:d1)
		 {
			 System.out.println(vish);
		 }
		System.out.println("===USING ITERATOR===");
		
		Iterator<Double> dou = d1.iterator();
		while(dou.hasNext())
		{
			System.out.println(dou.next());
		}
	}

}
