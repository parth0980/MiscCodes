import java.util.Scanner;
class Student
{
	 int roll;
	String name; 
	Scanner scan=new Scanner(System.in);
	void enter()
	{
	System.out.println("Enter roll num:-");
	roll=scan.nextInt();
	System.out.println("Enter name:-");
	name=scan.next();
	}
	void show()
	{
	System.out.println("Roll num:-"+roll);
	System.out.println("Name:-"+name);
	}
}

class Test extends Student
{
	int m1,m2,m3,m4,m5;
	Scanner scan=new Scanner(System.in);
	void enter1()
	{
	enter();
	System.out.println("Enter marks1:-");
	m1=scan.nextInt();
	System.out.println("Enter marks2:-");
	m2=scan.nextInt();
	System.out.println("Enter marks3:-");
	m3=scan.nextInt();
	System.out.println("Enter marks4:-");
	m4=scan.nextInt();
	System.out.println("Enter marks5:-");
	m5=scan.nextInt();
	}
	void show1()
	{
	show();
	System.out.println("Marks 1:-"+m1);
	System.out.println("Marks 2:-"+m2);
	System.out.println("Marks 3:-"+m3);
	System.out.println("Marks 4:-"+m4);
	System.out.println("Marks 5:-"+m5);
	}
}

class Result extends Test
{
	public static void main(String args[])
	{
	int per;
	Result r=new Result();
	r.enter1();
	r.show1();
	per=(r.m1+r.m2+r.m3+r.m4+r.m5)/5;
	System.out.println("Percentage="+per);
	if(per>90)
	{
	System.out.println("Grade=A");
	}
	else if(per>60 && per <90 )
	{
	System.out.println("Grade=B");
	}
	else
	{
	System.out.println("Grade=C");
	}
	}
}
