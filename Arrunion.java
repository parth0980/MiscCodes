import java.util.Scanner;
class Arrunion
{
      public static void main(String args[])
	{
	int a,b=5,c,d,i,j;
	Scanner scan=new Scanner(System.in);
	int[] x=new int[b];	
	int[] y=new int[b];
 System.out.println("Enter 1 array");
		for(i=0;i<b;i++)
		{
		x[i]=scan.nextInt();
		}
 System.out.println("Enter 2 array");
		for(j=0;j<b;j++)
		{
		y[j]=scan.nextInt();
		}
 System.out.println("Final:-");
i=0;
j=0;
	while(i<b && j<b)
		{
			if(x[i]<y[j])
			{
			 System.out.println(x[i]);
			i++;
			}
                                                else  if(x[i]>y[j])
			{
			 System.out.println(y[i]);
			j++;
			}
			else if(x[i]==y[j])
			{
			 System.out.println(x[i]);
			i++;
			j++;
			}

		}	
	while(i<b)
	{
	System.out.println(x[i]);	
	i++;
	}
  
                 while(j<b)
	{
	System.out.println(y[j]);
	j++;	
	}





	}

}