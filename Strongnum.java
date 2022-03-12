import java.util.Scanner;
class Strongnum
{
             public static void main(String arg[])
	{
                   int a,b,c,d=0,i=1;
	 Scanner scan=new Scanner(System.in);
                 System.out.println("Enter the number");
                 a=scan.nextInt();
                 do
	{   c=1;
	     b=a%10;
                     a=a/10;
                   while(i<=b)
                   {
	        c=c*i;
	        i++; 
                   }   
                    d=d+c;
	}while(a!=0);
 	System.out.println("The number="+d);
 	if(a==c)
	{
	System.out.println("It is a strong number");
	}
	else
	{
                System.out.println("It is not a strong number"); 
	}
	}
}