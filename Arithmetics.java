import  java.util.Scanner;
class Arithmetics
{
    public static void main(String args[])
{
                         int a,b,c,d,e,f;
                         Scanner scan= new Scanner(System.in);
                         System.out.println("Enter a");
                         a=scan.nextInt();

                         System.out.println("Enter b");
                         b=scan.nextInt(); 

                         c=a+b;
                         System.out.println("Add" +c);

                         f=a*b;
                         System.out.println("Mul" +f);
 
                        e=a-b;
                         System.out.println("Sub" +e); 

                         d=a/b;
                         System.out.println("Div" +d);


}


}