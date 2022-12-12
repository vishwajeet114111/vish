package ArrayStudy18;

public class Example2 {

	public static void main(String[] args) 
	{ 
		String  [] name = 
			{"shivani","vishwa","aniket","Pranav","khsitija"};
		int rollNo[]= {1,2,3,4};
	  
		//static for loop
		for(int i=0; i<=4;i++)
	    {
		  System.out.println(name[i]);
	    }
		for(int a=0; a<=3;a++)
		{
			System.out.println(rollNo[a]);
		}
		
	  System.out.println("--satic reverse order--");
	  for(int j=4; j>=0; j--)
	  {
		  System.out.println(name[j]);
	  }
	  for(int b=3; b>=0; b--)
	  {
		  System.out.println(rollNo[b]);
	  }
	  System.out.println("--dynamicforloop--");
	  
	  //dynamic for loop
	  
	  for(int x=0; x<=name.length-1;x++)
	  {
		  System.out.println(name[x]);
	  }
	  for(int c=0; c<=rollNo.length-1;c++)
	  {
		  System.out.println(rollNo[c]);
	  }
	
	  System.out.println("--dynamicreverseorder--");
	//dynamic reverse order
	  
	  for(int y=name.length-1; y>=0; y--)
	  {
		  System.out.println(name[y]);
	  }
	  for(int d=rollNo.length-1; d>=0; d--)
	  {
		  System.out.println(rollNo[d]);
	  }
}
}


		
	


