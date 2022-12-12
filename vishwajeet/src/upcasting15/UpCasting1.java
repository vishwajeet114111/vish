package upcasting15;

public class UpCasting1 {

	public static void main(String[] args) {
		
		ram r =new ram();//super class
		r.test();
		r.test1();
		System.out.println("=====");
		Air a=new Air();//sub class
		a.test();
		a.test1();
		a.jet();
		
		System.out.println("+++");
		//reference object =new sub class
		ram a1=new Air();
		a1.test();
		a1.test1();
		
	}

}
