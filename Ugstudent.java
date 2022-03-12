import java.util.Scanner;
class Students
{
	int usn,age;
	String name;
	Scanner scan=new Scanner(System.in);
	void details()
	{
	System.out.println("Enter usn:-");
	usn=scan.nextInt();
	System.out.println("Enter name:-");
	name=scan.next();
	System.out.println("Enter age:-");
	age=scan.nextInt();
	}
	void show()
	{
	System.out.println("Usn:-"+usn);
	System.out.println("Name:-"+name);
	System.out.println("Age:-"+age);
	}
	int getage()
	{
		return age;
	}
}

class Ugstudent extends Students
{
	int sem;
	float fees,stipend;
	Scanner scan=new Scanner(System.in);
	void details1()
	{
	details();
	System.out.println("Enter Semester:-");
	sem=scan.nextInt();
	System.out.println("Enter Fees:-");
	fees=scan.nextFloat();
	System.out.println("Enter Stipend:-");
	stipend=scan.nextFloat();
	}
	void show1()
	{
	show();
	System.out.println("Semester:-"+sem);
	System.out.println("Fees:-"+fees);
	System.out.println("Stipend"+stipend);
	}
	int getsem()
	{
		return sem;
	}
	public static void main(String args[])
	{	
	int i,s,a1=0,a2=0,st1=0,st2=0;
	Ugstudent[] ug=new Ugstudent[5];
	for(i=0;i<5;i++)
	{
	ug[i]=new Ugstudent();
	ug[i].details1();
	}
	for(i=0;i<5;i++)
	{
		s=ug[i].getsem();
		switch(s)
		{
			case 1:
			a1=a1+ug[i].getage();
			st1++;
			break;
			case 2:
			a2=a2+ug[i].getage();
			st2++;
			break;
		}
	}
	System.out.println("Age avg of sem 1 student="+(a1/st1));
	System.out.println("Age avg of sem 2 student="+(a2/st2));	
}
}
