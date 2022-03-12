import java.util.Scanner;
class Arrdeldup
{
	public static void main(String args[])
{
	int i,j,k,temp,b=5;
                Scanner scan=new Scanner(System.in);
	int[] a=new int[b];
	System.out.println("Enter the array:-");
                 for(i=0;i<b;i++)
                {	
	   a[i]=scan.nextInt();
	}
          for(i=0;i<b;i++)
          {
            for(j=i+1;j<b;)
	{
	    if(a[j]==a[i])
	     {
		for(k=j;k<b-1;k++)
		{
 		a[k]=a[k+1];
		}
		b--;
 	     }
	   else
{
	               j++;}
	    
	}
	        
	          
	
          }  
	System.out.println("New array:-");
          for(i=0;i<b;i++)
          {
              	System.out.println(a[i]);
          }
}


}