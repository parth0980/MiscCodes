import java.util.Scanner;
class Strcopy
{
	public static void main(String args[])
	{	
	String s1;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter string1:-");
	s1=scan.next();
	String s2=new String(s1);
	System.out.println(s2);
	}
}