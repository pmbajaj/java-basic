import java.util.Scanner;
class A
{
	int n;
	void p()
	{
		System.out.println("Program to Implement Multilevel Inheritance");
	}
}

class B extends A
{
	String str;
}
class multilevel extends B
{
	public static void main(String args[])
	{
		multilevel obj = new multilevel();
		Scanner sc = new Scanner(System.in);
		obj.p();
		System.out.println("Enter your Family Surname :");
		obj.str = sc.next();
		System.out.println("Enter Monthly income of your family :");
		obj.n = sc.nextInt();
		System.out.println("Family Name is : "+obj.str);
		System.out.println("Family Income is : "+obj.n);
	}
}