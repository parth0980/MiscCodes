import java.util.Scanner;
class Sum
{
  public static void main(String args[])
{
	int a,i,b=0;
         	Scanner scan=new Scanner(System.in); 
                System.out.println("Enter the number till which u want to find sum:-");
                a=scan.nextInt();
                for(i=0;i<=a;i++)
	{
	b=b+i;
	}
	                System.out.println("Sum="+b);
}


}