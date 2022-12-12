package Collection;
import java.util.ArrayList;
public class ArrayListStudy {
	public static void main(String[] args) 
	{
		//created object of arrylist
		ArrayList al=new ArrayList();
		al.add("vishwajeet");
		al.add("12");
		al.add(1, "ambhore");
		al.add("null");
		al.add(2, "parbhani");
		
		System.out.println(al);
		System.out.println(al.size());//size method
		System.out.println(al.contains("parbhani"));//contains method
		System.out.println(al.get(3));//get method
		System.out.println(al.indexOf("vishwajeet"));
		System.out.println(al.lastIndexOf("vishwajeet"));//index off method
		System.out.println(al.remove(1));//remove method
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//=============================================================================		
//		ArrayList<String>al1=new ArrayList<>();
//		al1.add("marathi");
//		al1.add("hindi");
//		al1.add("lang");
//		al1.add(2, "english");
//		System.out.println(al1);
		
		

	}

}
