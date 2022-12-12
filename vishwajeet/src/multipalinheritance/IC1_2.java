package multipalinheritance;

public class IC1_2 implements IC1,IC2 {
 
	public static void main(String[] args) {
		
		IC1.s1();
		IC2.s1();
		
		IC1_2 i = new IC1_2();
		i.test();
		i.m1();
		i.m2();

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		IC1.super.test();
		IC2.super.test();
	}

}
