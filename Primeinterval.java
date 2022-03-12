import  java.util.Scanner;
class Primeinterval
{
	public static void main(String args[])
       {
                  int a,b,i,j,c=0,d;
	 Scanner scan=new Scanner(System.in);
                 System.out.println("Enter the 1 digit:-");
                 a=scan.nextInt();
                  
                 System.out.println("Enter the 2 digit:-");
                 b=scan.nextInt();
	
                 System.out.println("The numbers are:-");
               for(i=a;i<=b;i++)
	{
	c=0;
                for(j=1;j<=i;j++)
	      {
	          if(i%j==0)
                            {
		c++;
                             }
                     }
                       if(c==2)
		{
                                              
		            System.out.println(i); 
                                                
                                                
                                               
                                 }
	                    
                                            }
	
          

}

}