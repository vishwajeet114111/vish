package abstractClass10;

public class ConcreteUse extends Sample{
	public static void main(String[] args) {
	
		//created object 
		ConcreteUse cu =new ConcreteUse();
		cu.add();
		cu.sub();
	
}

public void sub()   //body give by concrete class
{
	int x=20;
	int y=10;
	int z=x-y;
	System.out.println("sub is "+z);
	
}
	


}