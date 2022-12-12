package ArrayStudy18;

public class MultiDimentionalArrayEg2 {
	public static void main(String[] args) {
		
		char grade [][]= {{'A','B','X'},{'C','D','Y'}};
		for(int i =0;i<=grade.length-1;i++) 
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
	}

}
