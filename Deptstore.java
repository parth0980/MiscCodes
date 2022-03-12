import java.util.Scanner;
class Deptstore
{
	static int a=5,i,n,count=0;
	int[]	codeno=new int[100];
	 int[]	price=new int[100];
	 void insert()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the code number ");
	codeno[count]=scan.nextInt();
	System.out.println("Enter the price");
	price[count]=scan.nextInt();
	count++;
	}

	 void delete()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the code number u wan to delete:-");
	n=scan.nextInt();
	for(i=0;i<count;i++ )
	{
	 if(codeno[i]==n)
	{
	price[i]=0;
	}
	}

	}
		
	 void show()
	{
	for(i=0;i<count;i++)
	{
	System.out.println("Code number:-"+codeno[i]+" price:-"+price[i]);
	}
	}

	public static void main(String args[])
	{
	int b,i;
	String ch;
	Scanner scan=new Scanner(System.in);
	Deptstore ds=new Deptstore();
	System.out.println("Enter the code no:-");	

	System.out.println("Enter the operation you want to perform:-");
	do{
	System.out.println("1.Insert");
	System.out.println("2.Delete");
	System.out.println("3.Show");
	

	b=scan.nextInt();
	switch(b)
	{
	case 1:
	{
	ds.insert();
	break;
	}
	case 2:
	{
	ds.delete();
	break;
	}
	case 3:
	{
	ds.show();
	break;
	}
	default:
	{
	System.exit(0);
	}	
	}
	System.out.println("Do u want to continue?(y/n)");
	ch=scan.next();
	}while(ch.equals("y") || ch.equals("Y"));
	
}

}
