import java.util.Scanner;
class Arrrev
{
       public static void main(String arr[])
	{
		int i,b=5,c,j;
		Scanner scan=new Scanner(System.in);
		int[] x=new int[5];
		int[] y=new int[5];
                                System.out.println("Enter the array:-");
		for(i=0;i<b;i++)
		{
		   x[i]=scan.nextInt();
		}
		System.out.println("Reverse array:-");
		for(i=b-1;i>=0;i--)
		{
		  System.out.println(x[i]);
		}

	}




}