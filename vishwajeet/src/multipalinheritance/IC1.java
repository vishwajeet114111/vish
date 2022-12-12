package multipalinheritance;

public interface IC1 {

	void m1();
	default void test()
	{System.out.println("hi test");}
	static void s1()
	{System.out.println("hi s1");}
	
}
