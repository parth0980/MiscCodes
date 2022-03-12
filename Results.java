import java.util.Scanner;
interface Tw
{
	public void twmarks();
}

interface Ext
{
public void extmarks();
}

class Student implements Tw,Ext
{
	int m1,m2,m3,m4;
	Scanner scan=new Scanner(System.in);
	public void twmarks()
	{
	
	System.out.println("Term marks:-");
	System.out.println("Enter marks 1:-");
	m1=scan.nextInt();
	System.out.println("Enter marks 2:-");
	m2=scan.nextInt();
	}
	
	public void extmarks()
	{
	
	System.out.println("External marks:-");
	System.out.println("Enter marks 1:-");
	m3=scan.nextInt();
	System.out.println("Enter marks 2:-");
	m4=scan.nextInt();
	}
	
	public void name()
	{
	String name; 
	System.out.println("Enter name:-");	
	name=scan.next();
	}

}

class Results extends Student
{
	static int j,totext,tottw;
	public static void main(String args[])
	{
	Results[] r=new Results[5];
	
	for(j=0;j<1;j++)
	{
	r[j]=new Results();	
	r[j].name();
	r[j].twmarks();
	r[j].extmarks();
	System.out.println("Total term marks"+(r[j].m1+r[j].m2));			System.out.println("Total external  marks"+(r[j].m3+r[j].m4));

	}
	
	}

}	