import java.util.Scanner;
class Stamem
{	
	static int c;
	Stamem()
	{
	c++;
	}   	

	static void showcount()
	{
	System.out.println("C="+c);
	}
	
	public static void main(String args[])
	{
	Stamem st=new Stamem();
	Stamem st1=new Stamem();
	Stamem.showcount();
	

	}
}