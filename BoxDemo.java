class Box
{
	double length,breadth;
	void Area()
	{
		System.out.println("Area of rectagle is: ");
		System.out.println(length * breadth);
	}
}
public class BoxDemo
{
	public static void main(String args[])
	{
		Box mybox = new Box();
		mybox.length = 20.0;
		mybox.breadth = 9.0;
		mybox.Area();
	}
}