import java.util.Scanner;
class Arrmax
{

	public static void main(String args[])
	{
		int b,i,j,c=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		b=scan.nextInt();
		int[] a=new int[b];	
                                for(i=0;i<b;i++)
		{
		a[i]=scan.nextInt();
		}
                                for(i=0;i<b;i++)
		{
		            for(j=1;j<b;j++)
		            {
		  	if(a[i]<a[j])
			{
			  c=a[j];
			}
			if(a[i]>a[j])
			{
			c=a[i];
			}
			
				
		             }
		}
                                 
		System.out.println("Max element:-"+c);

	}

}