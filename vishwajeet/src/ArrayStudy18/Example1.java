package ArrayStudy18;

public class Example1 {

	public static void main(String[] args) 
	{
		//array declaration
		float weight[]= new float[5];
		
		//array initialization
			weight[0]=22.22f;
			weight[1]=33.33f;
			weight[2]=44.44f;
			weight[3]=55.55f;
			weight[4]=66.66f;
		//array usage
			System.out.println(weight[0]);
			System.out.println(weight[1]);
			System.out.println(weight[2]);
			System.out.println(weight[3]);
			System.out.println(weight[4]);
			//System.out.println(weight[5]); exception
			
			System.out.println("+++++++++++++++++++++++++++++++++");
			//use of static for loop to print array
			
			for(int i=0;i<=4;i++)
			{
				System.out.println(weight[i]);
			}
			System.out.println("++++++++++++++++++++++++++++++++");
			//use of dynamic for loop to print array
			
			for(int i=0; i<=weight.length-1; i++)
			{
				System.out.println(weight[i]);
			}
			System.out.println("++++++++++++++++++++++++++++++++");
			//dynamic for loop in reverse order
			
			for(int i=weight.length-1;i>=0;i--)
			{
				System.out.println(weight[i]);
			}
		}

	}