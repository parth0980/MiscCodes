import java.util.Scanner;
class Matrixiden
{
  	public static void main(String args[])
	{
	int r,sum=0,c,b,i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter rows:-");
	r=scan.nextInt();
	System.out.println("Enter columns:-");
	c=scan.nextInt();
	int[][] a=new int[r][c];
	int[][] ide=new int[r][c];
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
		System.out.print(a[i][j]+" ");
		}
	System.out.println(" ");
	}
	
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
                  if((i==j && a[i][j]==1) || (i!=j && a[i][j]==0))
               {
	    sum=0;
	    sum=sum+1;	  
	}
                 else
	  sum=0;
	}  
	}       
                if(sum==1)
	{
	System.out.println("It is identity matrix");
	}
	else
	{
	System.out.println("It is not an identity matrix");
	}
}
}