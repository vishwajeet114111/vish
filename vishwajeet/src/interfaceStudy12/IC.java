package interfaceStudy12;

public class IC implements TestInterface {

	public static void main(String[] args) {
		IC i =new IC();// created object of implementation class
		i.test2();
		i.test();
		i.test1();
		int c=a+20;
		System.out.println("c value is "+c);
	}
	
	public void test2()
	{System.out.println("hi i am test 2");}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("hi i am test");
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("hi i am test 1");
	}
}
