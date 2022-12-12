package accesssSpecifier91;

import accesssSpecifier9.Test1;

public class Test3 extends Test1
{

	public static void main(String[] args) 
	{
		Test1 t1  = new Test1();  //create object other package
		t1.div();				  //calling only public method
		System.out.println("this is public global variable d "+t1.d);
	
		Test3 t3 =new Test3();//create object of same class after inheritance concpt
		t3.mul();			  //calling protected method only use extends keyword 
		System.out.println("global variable from "+t3.c);
		System.out.println("those o/p of another package");
	}

}
