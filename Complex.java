class Complex
{
	int a,b;
	Complex(int r,int i)
	{
	a=r;
	b=i;
	}


	public static void main(String args[])
	{
	int real,image;
	Complex c= new Complex(10,20);
	Complex c1= new Complex(10,20);
	
	 real=c.a+c1.a;
	 image=c.b+c1.b;
	System.out.println("Add="+real+"+i"+image);	
	System.out.println("Sub="+real+"-i"+image);
	System.out.println( );
	}

}