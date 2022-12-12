package methodStudy3;

public class UniversityStudent {

	public static void main(String[] args) {
		UniversityStudent us=new UniversityStudent();
		us.studentinfo("vish", 850, 9900, 112233445566778899l,'M');
		us.studentinfo("sss", 58580, 3660, 5353535327288290l,'f');

	}
	public void studentinfo(String a,int b,float c,long d,char e)
	{
		System.out.println("=========================");
		System.out.println("student name is "+a);
		System.out.println("student mark is "+b);
		System.out.println("student fees is "+c);
		System.out.println("student id no. is "+d);
		System.out.println("student gender is "+e);
		System.out.println("=========================");
	}
	
	
}
