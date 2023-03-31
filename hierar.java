class A
{
	void m()
	{
		System.out.println("Program to Implement Hierarchical Inheritance.");
	}
}

class B extends A
{
	void m1()
	{
		System.out.println("Method of class B was called.");
	}
}
class C extends A
{
	void m2()
	{
		System.out.println("Method of class C was called.");
	}
}
class hierar extends A
{
	public static void main(String args[])
	{
		hierar obj = new hierar();
		B ob = new B();
		C ob1 = new C();
		obj.m();
		ob.m1();
		ob1.m2();
	}
}