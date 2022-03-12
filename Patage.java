import java.util.Scanner;
class Patdetails
{
	String name,datadd,datdis,disease;
	Scanner scan=new Scanner(System.in);
	void adddetails()
	{
	System.out.println("Enter name:-");
	name=scan.next();	
	System.out.println("Enter disease:-");
	disease=scan.next();
	System.out.println("Enter Addmission Date:-");
	datadd=scan.next();
	System.out.println("Enter Discharge Date:-");
	datdis=scan.next();
	}

	void show()
	{
	System.out.println("Name:-"+name);
	System.out.println("Addmission date:-"+datadd);
	System.out.println("Disease:-"+disease);
	System.out.println("Discharge date:-"+datdis);
	}

	}


class Patage extends Patdetails
{
	int age;
	void addage()
	{
	adddetails();
	System.out.println("Enter patients age");
	age=scan.nextInt();
	}
	void show2()
	{
	show();
	System.out.println("Age:-"+age);
	}

	public static void main(String args[])
	{
	    	int i;
		Patage[] pt=new Patage[3];
		System.out.println("Patient details:-");
		for(i=0;i<3;i++)
		{
		pt[i]=new Patage();
		pt[i].addage();
		}
		
		System.out.println("patient details");
		for(i=0;i<3;i++)
		{
		if(pt[i].age<12)
		pt[i].show2();
		}
		
 	}

}