import java.util.Scanner;
class A
{
	int n;
	void p()
	{
		System.out.println("Program to implement Single Inheritance.");
	}
}
class sin_inheri extends A
{
	public static void main(String args[])
	{
		sin_inheri obj = new sin_inheri();
		Scanner sc = new Scanner(System.in);
		obj.p();
		System.out.println("Enter a number to find factorial of :");	
		obj.n = sc.nextInt();
		int fact =1;
		for(int i = 1; i<=obj.n; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is :"+fact);
	}
}