import java.util.Scanner;

class floydWar
{
	int n;
	void floWar(int dist[][])
	{
		for(int k = 0; k < n ; k++)
		{
			for(int i = 0;i<n;i++)
			{
				for(int j =0;j<n;j++)
				{
					if(dist[i][j] > (dist[i][k] + dist[k][j]))
					{
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		print(dist);
	}
	void print(int dist[][])
	{
		System.out.println("This Matrix Shows the All Pair Shortest Path : ");
		for(int i = 0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				if (dist[i][j] == 999)
				{
					System.out.print("INF ");
				}
				else
				{
					System.out.print(dist[i][j] + " ");
				}
				System.out.println("");
			}
		
		}
	}
	public static void main(String args[])
	{
		int G[][] = new int[10][10];
		floydWar obj = new floydWar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes in Graph :");
		obj.n = sc.nextInt();
		System.out.println("Enter 999 if no connection and 0 for self loop.");
		for(int i = 0; i<obj.n;i++)
		{
			for(int j = 0;j<obj.n;j++)
			{
				System.out.print("Distance between "+i+" "+j+" is :");
				G[i][j] = sc.nextInt();
			}
		}
		obj.floWar(G);
	}
}