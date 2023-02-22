class func_over
{
void vol(int r,int h)
{
System.out.println("Volume of Cylinder is: "+(r*r*h));
}

void vol(int s)
{
System.out.println("Volume of Cube is: "+(s*s*s));
}

void vol(int l,int b,int h)
{
System.out.println("Volume of Cuboid is: "+(l*b*h));
}
public static void main(String args[])
{
func_over obj = new func_over();
obj.vol(7,10);
obj.vol(5);
obj.vol(7,9,5);
}
}