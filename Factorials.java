import  java.util.Scanner;

class Factorials
	{
	public static void main(String args[])
               { 
	int a,i,n=1,b;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter factorial:-");
	a=scan.nextInt();
	for(i=1;i<=a;i++)
	 {
	  n=n*i;		
  	 } 
                System.out.println("Factorials (n!)="+n);
	 }

	}