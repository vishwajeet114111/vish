package accesssSpecifier9;

public class Test2 {

	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();  //created object of another class
		
		//method calling
		//t1.add();   unable to call because private method
		t1.sub();
		t1.mul();
		t1.div();
		
		//variable calling
		
		System.out.println("this is golbal variable b "+t1.b);
		System.out.println("this is golbal variable c "+t1.c);
		System.out.println("this is golbal variable d "+t1.d);
	}

}
