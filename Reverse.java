import  java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
	 int a,b=0,c,i;
                 Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number:-");
	a=scan.nextInt();
                do
	{
	c=a%10;  
	a=a/10;
                b=b*10+c;
	}while(a!=0);	
                System.out.println("Reverse="+b);	
                }
       
}