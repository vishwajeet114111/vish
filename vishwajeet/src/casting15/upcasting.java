package casting15;

public class upcasting {

	public static void main(String[] args) 
	{
		father f1 =new father();
		f1.money();
		f1.home();
		System.out.println("======");
		
		son s1= new son();
		s1.money();
		s1.home();
		s1.sharemarket();
		System.out.println("======");
		
		//reference object =new sub class
		father f =new son();
		f.money();
		f.home();
	}

}
