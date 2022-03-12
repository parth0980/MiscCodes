import java.util.Scanner;
class Matrix
{
 	public static void main(String args[])
	{
	int i,j,c,r;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter rows:-");
	r=scan.nextInt();
	System.out.println("Enter Columns:-");
	c=scan.nextInt();
	int[][] a=new int[r][c];
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{	
		a[i][j]=scan.nextInt();
		}
	}
	System.out.println("Matrix:-");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{	
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	

}

}