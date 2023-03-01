import java.util.Scanner;

public class stackimp
{
	int a[]=new int[20];
	int top = -1;
	void push(int val)
	{
		if (top >= (20 - 1))
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			a[++top] = val;
			System.out.println(val + " pushed into stack");
		}
	}
	void pop()
	{
		if (top < 0)
		{
			System.out.println("Stack Underflow");
        }
        else
		{
            int x = a[top--];
            System.out.println("Value poped is : "+x);
        }
	}
	void disp()
	{
		if (top < 0)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			int x = a[top];
			System.out.println("Top element is : "+x);
		}
	}
	public static void main(String args[])
	{
		int ch,p;
		stackimp ob = new stackimp();
		Scanner obj = new Scanner(System.in);
		System.out.println("**********MENU************");
		System.out.println("1.Push , 2.Pop , 3.Display , 4.Exit");
		while(1>0)
		{
			System.out.println("Enter Your Choice : ");
			ch = obj.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter value to push : ");
				p = obj.nextInt();
				ob.push(p);
				break;

				case 2:
				ob.pop();
				break;

				case 3:
				ob.disp();
				break;

				case 4:
				break;

				default:
				System.out.println("Wrong Choice Re-enter.");
				break;
			}
			if(ch == 4)
			{
				break;
			}
		}
	}
}