import java.util.Scanner;
class Queue
{
     	int front=-1,rear=-1,i,size=5;
	int[] a=new int[size];
	Scanner scan=new Scanner(System.in);	
	void push()
	{
	int b,c=0;
	if(rear==size)
	{
	System.out.println("Queue overflow.");
	}
	else
	{
	if(front== -1)
	{
	front=0;
	}
	rear++;
	a[rear]=scan.nextInt();
	c++;
	}
	}


	void pop()
	{
	if(rear<0)
	{
	System.out.println("Queue underflow.");
	}
	else
	{
	front++;
	}
}
	

	void display()
	{
	for(i=front;i<=rear;i++)
		{
		System.out.println(a[i]);
		}
	}
	
	
	public static void main(String args[])
	{

		String ch;
		int x;
		Scanner scan=new Scanner(System.in);
		Queue q=new Queue();
	
		do
		{
		System.out.println("Enter the operation you want to perform:-");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		x=scan.nextInt();

		switch(x)
		{
		case 1:
		q.push();
		break;
		case 2:
		q.pop();
		break;
		case 3:
		q.display();
		break;
		}
	
		System.out.println("Do u want to continue?(y/n)");
		ch=scan.next();
		}while(ch.equals("Y")||ch.equals("y"));	
     		}

}