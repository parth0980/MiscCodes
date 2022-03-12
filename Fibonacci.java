import  java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
{

 int a,temp1,first=0,second=1,i;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the length of series:-");
a=scan.nextInt();
System.out.println(first);
System.out.println(second);

for(i=0;i<a;i++)
{
if(a<1)
{
first=0;
}
else
{
temp1=first+second;
first=second;
second=temp1;
System.out.println(temp1);
}
}
}
}