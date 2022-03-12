import java.util.Scanner;
class Matrixupptri
{
	public static void main(String args[])
	{
	int i,j,r,c;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter row:-");
	r=scan.nextInt();	
	System.out.println("Enter column:-");
	c=scan.nextInt();
	
	int[][] a=new int[r][c];
	int[][] b=new int[r][c];

	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	 a[i][j]=scan.nextInt();
	}
	}
	

	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	if(i+j>=i+i)
	{
	b[i][j]=a[i][j];
	}
	else if(i+j<=i+i)
	{
	b[i][j]=0;
	}
	}
	}

System.out.println(" Matrix:-");

	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	System.out.print(a[i][j]+ " ");
	}
	System.out.println(" ");
	}




System.out.println(" Upper triangular matrix:-");

	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	System.out.print(b[i][j]+ " ");
	}
	System.out.println(" ");
	}
	}
}