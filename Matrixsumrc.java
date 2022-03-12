import java.util.Scanner;
class Matrixsumrc
{
	public static void main(String args[])
	{
	int r,d=0,k,l,c,i,j,sum=0;
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
		System.out.println(" ");
	}
		System.out.println("Row sum ");

	for(i=0;i<r;i++)
	{
		sum=0;
		for(j=0;j<c;j++)
		{
			
				sum=sum+a[i][j];
							
		}
		System.out.println("Sum of row "+(i+1)+ "is"+sum);	
		
	}	

	System.out.println("Column sum");
	for(j=0;j<c;j++)
	{
	  sum=0; 
	  for(i=0;i<r;i++)
	  {
	     sum=sum+a[i][j];
	      }
	   System.out.println("Sum of columns"+(j+1)+"is"+sum);
	}
	


	}
	
}