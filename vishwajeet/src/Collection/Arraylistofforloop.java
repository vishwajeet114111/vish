package Collection;

import java.util.ArrayList;

public class Arraylistofforloop {

	public static void main(String[] args) 
	{
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		System.out.println(a1);
		System.out.println("=====By using get method=============");
		
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(3));
		System.out.println(a1.get(4));
		System.out.println(a1.get(5));
		System.out.println(a1.get(6));
		System.out.println(a1.get(7));
		
		System.out.println("====USING FOR LOOP IN SATIC WAY====");
		for(int i=0; i<=7; i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("====USING FOR LOOP IN DYNAMIC WAY====");
		for(int i=0; i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		
	}
	
	
	
	
	
	
	
//	//string
	
//	ArrayList<String>a2=new ArrayList<>();
//	a2.
//	//for(string each:a2)
//	{
//		System.out.println(each);
//	}
//	
//	//float
//	
//	
	
	
	
	
	

}
