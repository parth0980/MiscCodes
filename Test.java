import java.util.Scanner;
class Test
{
	int no;
	String name;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter no:");
		no=sc.nextInt();
	}
	void dis()
	{
	System.out.println("Name:"+name);
	System.out.println("No"+no);	
	}
	public static void main(String args[])
	{
		int i;
		Test[] t=new Test[10];
		for(i=0;i<2;i++)
		{
			t[i]=new Test();
			t[i].getdata();
		}
		for(i=0;i<2;i++)
		{
			t[i].dis();
		}
	}
}
