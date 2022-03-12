import java.util.Scanner;
 class Distance
{
	int fltnum;
	String dest;
	float dist;
	float fuel;
	void calfuel()
	{
	if(dist<=1000)
	{
	fuel=500;
	}
	else if (dist>=1000&& dist<=2000)
	{
	fuel=1100;
	}
	else
	{
	fuel=2200;
	}
	}
	
	void feedinfo()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Flight number ");
	fltnum=scan.nextInt();
	System.out.println("Enter Destination ");
	dest=scan.next();
	System.out.println("Enter Distance ");
	dist=scan.nextFloat();
	}
	void show()
	{
	System.out.println("Flightnum:-"+fltnum);
	System.out.println("Destination:-"+dest);
	System.out.println("Distance:-"+dist);
	System.out.println("Fuel:-"+fuel);
	}

	public static void main(String args[])
	{
	 Distance d=new Distance();
	d.feedinfo();
	d.calfuel();
	d.show();
	}

}




