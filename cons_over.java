class cons_over
{
int age;
cons_over()
{
System.out.println("The details of a student in Btech-2nd Year are : ");
}
cons_over(String name)
{
System.out.println("Name of the student is: "+name);
}

cons_over(int a)
{
age = a;
System.out.println("Age of the student is: "+a);
}

public static void main(String args[])
{
cons_over obj = new cons_over();
cons_over obj1 = new cons_over("Siddharth Sharma");
cons_over obj2 = new cons_over(19);
}
}