class stablock
{
static int l;
static
{
l = 5;
}
public static void main(String args[])
{
int f = 1;
for(int i = 1; i<=5 ; i++)
{
f *= i;
System.out.println("Factorial is : " + f);
}

int g = 1;
for(int i = 1; i<=l ; i++)
{
g = g * i;
System.out.println("Factorial is : " + g);
}
}
}
