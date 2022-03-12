import java.util.Scanner;
class Matrixdiasum
{
	public static void main(String args[])
	{
	int r,sparsh,c,i,j,sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter rows:-");
	r=scan.nextInt();
	System.out.println("Enter columns:-");
	c=scan.nextInt();
	int[][] a=new int[r][c];
	System.out.println("Enter matrix:-");
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
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i==j)
			{
			sum=sum+a[i][j];
			}
		}
	}	
	System.out.println("Sum="+sum);


	}
	
}