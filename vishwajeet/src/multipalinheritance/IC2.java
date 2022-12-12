package multipalinheritance;

public interface IC2 {
	void m2();
	default void test()
	{System.out.println("hi test1");}
	static void s1()
	{System.out.println("hi s2");}

}
