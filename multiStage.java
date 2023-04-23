import java.util.Scanner;
class multiStage
{
final int INF = 999;
static int k,n;
static int G[][] = new int[20][20];
static int P[] = new int[20];
static int cost[] = new int[20];
static int c[] = new int[20];
static void input()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of stages: ");
k = sc.nextInt();
System.out.print("Enter number of nodes: ");
n = sc.nextInt();
System.out.println("Enter 999 for no edge and weight for the edges :");
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
System.out.print("Egde between "+(i+1)+" and "+(j+1)+" is: ");
G[i][j] = sc.nextInt();
}
}
}
public static void main(String args[])
{
input();
System.out.println("Shortest distance is: "+dist());
}
static int dist()
{
cost[n-1] = 0;
for(int j = n-2;j>=0;j--)
{
cost[j] = 999;
for(int i=j;i<n;i++)
{
if(G[j][i] == 999)
{
continue;
}
if(cost[j] > G[j][i] + cost[i])
{
cost[j] = G[j][i] + cost[i];
}
else
{
cost[j] = cost[j];
}
}
}
return cost[0];
}
}

