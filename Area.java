public class Area
{
	int a;
	public static void main(String args[])
	{
		Area obj = new Area();
		obj.area1(5,6);
	}
	void area1(int l,int b)
	{
		a = l * b;
		System.out.println("Area is: "+a);
	}
}