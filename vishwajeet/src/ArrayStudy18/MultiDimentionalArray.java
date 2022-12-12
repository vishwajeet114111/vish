package ArrayStudy18;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		//1. declaration
		int rollNum[][]=new int[2][2];

		//2.initialization
		rollNum[0][0]=10;
		rollNum[0][1]=11;
		rollNum[1][0]=12;
		rollNum[1][1]=13;

		//3.usage
		//System.out.println(rollNum[1][1]);

		System.out.print(rollNum[0][0]+" ");
		System.out.println(rollNum[0][1]);
		System.out.print(rollNum[1][0]+" ");
		System.out.println(rollNum[1][1]);
		
		System.out.println("============");
		//print using for loop

		for(int i=0;i<=rollNum.length-1;i++)
		//outer for loop(for rows)//i=0
		//i=0;1,2

		for(int j=0;j<=rollNum.length-1;j++)
		//inner for loop(for columns)
		//j=0,1,2
		//j=0,1,2

		{
		System.out.print(rollNum[i][j]+" ");
		//00->,0 1-->
		//1 0 -->, 1,1-->
		}
		System.out.println();
}
}