class Funoverloading
{
		
	 double a=1;
final int i=1;
void power(double m,int n)
{
	double w,i;
	for(i=1;i<=n;i++)
	{
	a=a*m;
	}
System.out.println(a);

}
void power(int  m,int n)
{
	int i ,p;
	for(i=1;i<=n;i++)
	{
	 a=a*m;
	}
System.out.println(a);

}

	public static void main(String args[])
	{
	Funoverloading fn=new Funoverloading();
	fn.power(12.9,8);
 	fn.power(12,8);
	} 
}