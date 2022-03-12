import  java.util.Scanner;
class Prime
{
        public static void main(String args[])
{
                   int a,i,b=0;        
                 Scanner scan= new Scanner(System.in);
                 System.out.println("Enter your number to be checked:-");
                 a=scan.nextInt();
 	 for(i=1;i<=a;i++)
               {
 	  if(a%i==0)
                 {
 	     b++;
	  }
               }
                 if(b==2)
	{
 	  System.out.println("It is prime number");	
	}
                else
	{
	 System.out.println("It is not a prime number.");
	}	
}
}