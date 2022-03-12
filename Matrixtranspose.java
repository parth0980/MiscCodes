import java.util.Scanner;
class Matrixtranspose
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
	b[i][j]=a[j][i]; 
	}
	}
	
	System.out.println("Matrix :-");
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.println(" ");
	}

	System.out.println("Transpose :-");
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	System.out.print(b[i][j]+" ");
	}
	System.out.println(" ");
	}
	



	}
}