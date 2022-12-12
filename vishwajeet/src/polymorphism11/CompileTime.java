package polymorphism11;

public class CompileTime {
	public static void main(String[] args) {
		
		CompileTime ct =new CompileTime();
		ct.add();
		ct.add(20, 80);
	}
	
	public void add()
	{
	  int q=25;
	  int w=25;
	  int e=q+w;
	  System.out.println("sum is "+e);	
	}
	public void add(int q,int w)
	{
		int e=q+w;
		System.out.println("add is "+e);
		
	}
}
