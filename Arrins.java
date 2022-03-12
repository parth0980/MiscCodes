import java.util.Scanner;
class Arrins
{
	public static void main(String args[])
	{
	int b,c,d,i,temp=0,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of array");	
	b=scan.nextInt();
	System.out.println("Array:-");
	int[] a=new int [b+1];
                for(i=0;i<b;i++)
	{
	a[i]=scan.nextInt();
	}
	System.out.println("	Enter ther position u want to enter:-");
	c=scan.nextInt();
	System.out.println("Enter the value of element:- ");
	d=scan.nextInt();
                
	for(i=b-1;i>=c-1;i--)
                {
                  a[i+1]=a[i];
	}
 	a[c-1]=d;
                for(i=0;i<=b;i++)
	{
	System.out.println(a[i]);
	}
	}


}