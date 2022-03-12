import  java.util.Scanner;
class Calc
{
       public static void main(String arg[])
     {
       int a,b,c,d,e;
       Scanner  scan= new Scanner(System.in);
       System.out.println("Enter the selected numbers- (2>1)");
 
      b=scan.nextInt();
      d=scan.nextInt();
 
       System.out.println("1.Add  2.Sub  3.Mul  4.Div");
       System.out.println("Enter the choice u want to perform:-");
       a=scan.nextInt();
      switch(a)
          {  
              case 1:
              c=d+b;
              System.out.println("Add="+c);
              break;
              
              case 2:
               c=d-b;
               System.out.println("Sub="+c);
               break;
              
              case 3:
              c=d*b;
              System.out.println("Mul="+c);
              break; 
              
             case 4:
             c=d/b;
             System.out.println("Div="+c);
             break;
           
            default :
            System.out.println("Wrong input:-");
            
          }
     }
}