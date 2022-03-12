import java.util.Scanner;
class Arrdec
{
	public static void main(String args[])
{
	int i,j,temp,b=5;
                Scanner scan=new Scanner(System.in);
	int[] a=new int[5];
	System.out.println("Enter the array:-");
                 for(i=0;i<b;i++)
                {	
	   a[i]=scan.nextInt();
	}
          for(i=0;i<b;i++)
          {
            temp=0;
	   for(j=i+1;j<b;j++)
	{
	   if(a[j]<=a[i])
 	      {
	         temp=a[j];
	         a[j]=a[i];
                         a[i]=temp;
	        
	      }
                 
	                  
	}
          }  
	System.out.println("New array:-");
          for(i=0;i<b;i++)
          {
              	System.out.println(a[i]);
          }
}


}