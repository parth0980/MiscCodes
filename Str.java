import  java.util.Scanner;
class Str
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int i;
		System.out.println("enter string");
		s=sc.next();
		char[] ch=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			System.out.println(ch[i]);
		}
	}
}