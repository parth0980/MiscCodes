import java.util.Scanner;
class Strfre
{
	public static void main(String args[])
	{
	String s1;
	int i,j,k=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter String 1:-");
	s1=scan.next();
	/*char ch2;
	System.out.println("Enter element:-");
	ch2=scan.next().charAt(0);*/
	char[] ch=s1.toCharArray();
	 for(i=0;i<s1.length();i++)
	{
		k=1;
	 	for(j=i+1;j<s1.length();j++)
		{
		if(ch[j]==ch[i])
		{
		k++;
		}
		}
		System.out.println("Frequency of "+ch[i]+k);
	} 
	



	}
	

}