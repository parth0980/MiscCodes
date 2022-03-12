import  java.util.Scanner;
class Digit
{
    public static void main(String args[])
{

 int a,b=0,c=0,i;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the digit:-");
a=scan.nextInt();
do{
b=a%10;
a=a/10;
c++;
}while(a!=0);
System.out.println("Number of digits:-"+c);
}
}