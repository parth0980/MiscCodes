import java.util.Scanner;
class Report
{
	int addno;
	String name;
	float marks1,marks2,marks3,marks4,marks5;
	float average;

	void getavg()
	{
	average=(marks1+marks2+marks3+marks4+marks5)/5;
	}
	
	void readinfo()
	{
	int i;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Addmission number:-");
	addno=scan.nextInt();
	System.out.println("Enter the name :-");
	name=scan.next();
	System.out.println("Enter the marks of 5 subject in order:-");
	
	marks1=scan.nextFloat();	
	marks2=scan.nextFloat();
	marks3=scan.nextFloat();
	marks4=scan.nextFloat();
	marks5=scan.nextFloat();
	}

	void displayinfo()
	{
	System.out.println("Add no:- :-"+addno);
	System.out.println(" Name :-"+name);
	System.out.println("Marks are :-"+marks1+ " " +marks2 +" "+marks3+" "+marks4+" "+marks5+" ");
	System.out.println("Average :-" +average);
	}
	

	public static void main(String args[])
	{
	Report r=new Report();
	r.readinfo();
	r.getavg();
	r.displayinfo();
	}
}