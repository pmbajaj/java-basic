public class Prg2
{
    int Age;
    Prg2()
    {
        System.out.println("Default Contructor was called.");
    }
    Prg2(int a,int b)
    {
        System.out.println("The Sum is:"+(a+b));
    }
    void getAge(int a)
    {
        Age=a;
        System.out.println("The Age is:"+Age);
    }
public static void main(String[] args)
{
System.out.println("Hello World");
Prg2 obj=new Prg2();
Prg2 obj1=new Prg2(5,6);
obj.getAge(19);
}
}