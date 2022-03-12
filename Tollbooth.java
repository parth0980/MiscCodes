import java.util.Scanner;

class Tollbooth

{
	int toe;
	double total;	
	Tollbooth()
	{
	toe=0;
	total=0;
	}
	
	void payingcar()
	{
	toe=toe+1;
	total=total+0.5;
	}

	void nonpaycar()
	{
	toe=toe+1;
	}
	
	void display()
	{
	 System.out.println("Total cars"+toe);
	System.out.println("Total amount"+total);
	}

	public static void main(String args[])
	{
	int p;
	Tollbooth t=new Tollbooth();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter choice");
	System.out.println("1.Paying car");
	System.out.println("2.Non-paying car");	
	p=scan.nextInt();
	switch(p)
		{
		case 1:
		{
		t.payingcar();
		t.display();
		break;
		}
		case 2:
		{
		t.nonpaycar();
		t.display();
		break;
		}
		default:
		System.exit(0);
		}
	}
}