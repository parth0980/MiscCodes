import java.util.Scanner;
class Divmul
{
	public static void main(String args[])
 	{
	  int a,b,c,d,lcm=0,hcf=0,i,j,k;
                  Scanner scan= new Scanner(System.in);
	 System.out.println("Enter number 1:-");
                 a=scan.nextInt();  
	 System.out.println("Enter number 2 (1<2):-");
	 b=scan.nextInt(); 
	for(i=1;i<=a;i++)
	{
               if(a%i==0  &&  b%i==0)
	{
	hcf=i;
	}
	}

                lcm=(a*b)/hcf;
  System.out.println("HCF"+hcf);
  System.out.println("LCM"+lcm);	
}
	
}