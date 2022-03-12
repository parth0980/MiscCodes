import java.util.Scanner;
class Matrixmul
{
	public static void main(String args[])
	{
	int i,j,k,r1,r2,c1,c2;
 	Scanner scan=new Scanner(System.in);
                
	System.out.println("Enter rows for 1st matrix:");
 	r1=scan.nextInt();
	System.out.println("Enter columns for 1st matrix;");
	c1=scan.nextInt();
	int[][] a1=new int[r1][c1];
 	System.out.println("Enter 1st matrix");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
		a1[i][j]=scan.nextInt();
		}
	}
	

	System.out.println("Enter rows for 2nd matrix:");
 	r2=scan.nextInt();
	System.out.println("Enter columns for 2nd matrix;");
	c2=scan.nextInt();
	int[][] a2=new int[r2][c2];
 	System.out.println("Enter 1st matrix");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
		a2[i][j]=scan.nextInt();
		}
	}
	
	System.out.println("Matrix 1:-");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
		System.out.print(a1[i][j]+" ");
		}
		System.out.println();
	}

	System.out.println("Matrix 2:-");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
		System.out.print(a2[i][j]+" ");
		}
		System.out.println();
	}	
	
	System.out.println("Multipication ;-");
	int[][] mul=new int[r1][c1];
	int sum=0;
	                for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
		for(k=0;k<r1;k++)
		{
	
		
		sum=sum+a1[i][k]*a2[k][j];
		}
		mul[i][j]=sum;
	               	sum=0;
		}
		
	}


	
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
		System.out.print(mul[i][j]+" ");
		}
		System.out.println();
	}	
	}


}