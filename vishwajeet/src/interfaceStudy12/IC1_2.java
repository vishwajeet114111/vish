package interfaceStudy12;


public class IC1_2 implements I2{

	public static void main(String[] args) {
		
	IC1_2 i12  =new IC1_2();
	i12.sample1();
	i12.sample2();
	i12.sample3();
	i12.sample4();
	}

	@Override
	public void sample1() {System.out.println("sample 1 from I1 interface ");}

	@Override
	public void sample2() {System.out.println("sample 2 from I1 interface ");}

	@Override
	public void sample3() {System.out.println("sample 3 from I2 interface ");
	}

	@Override
	public void sample4() {System.out.println("sample 4 from I2 interface ");}

	
		
	

}
