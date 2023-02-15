import java.util.Scanner;
public class I_sort
{
public static void main(String args[])
{
   int t,min,n,j;
   int a[]=new int[20];
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter number of elements:");
   n=obj.nextInt();
   System.out.println("Enter un-sorted array is:");
   for(int i=0;i<n;i++)
   {
       a[i]=obj.nextInt();
   }
   for(int i=1;i<n;i++)
   {
       j=i-1;
       min=a[i];
       while(j>=0 && a[j]>min)
       {
           a[j+1]=a[j];
           j--;
       }
       a[j+1]=min;
   }
   System.out.println("The sorted array is:");
   for(int i=0;i<n;i++)
   {
       System.out.println(a[i]);
   }
System.out.println("Hello World");
}
}