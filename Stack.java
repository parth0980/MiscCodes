import java.util.Scanner;
class Stack

{
	int i= -1,size=5,c;
	
	
	Scanner scan=new Scanner(System.in);
	int[]  a=new int[size];
	void push()
	{
		if(i>size)
		{
		System.out.println("Stack overflow:-");
		}
		else
		{
		i++;
		a[i]=scan.nextInt();
		c++;
		}
	}
 	void pop()
	{
		if(i>size)
		{
		System.out.println("stack underflow");
		}	
		else
		{
		i--;
		c--;		
		}
	}

	void display()
	{
		for(i=c-1;i>=0;i--)
		{
		System.out.println(""+a[i]);
		}
	}
	
	

	public static void main(String args[])
	{
	String ch;
	int n;
	Scanner scan=new Scanner(System.in);
	Stack s=new Stack();
	
	
		do
		{
		System.out.println("Enter the operation uj want to perform:-");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		n=scan.nextInt();

		switch(n)
		{
		case 1:
		s.push();
		break;
		case 2:
		s.pop();
		break;
		case 3:
		s.display();
		break;
		}
	
		System.out.println("Do u want to continue?(y/n)");
		ch=scan.next();
		}while(ch.equals("Y")||ch.equals("y"));
	}

	}
}