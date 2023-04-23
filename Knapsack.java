import java.util.Scanner;
class Knapsack 
{
	static int max(int a, int b) 
	{ 
		return ((a > b) ? a : b); 
	}
	static int knapSack(int W, int wt[], int val[], int n)
	{
		if (n == 0 || W == 0)
		{
			return 0;
		}
		if (wt[n - 1] > W)
		{
			return knapSack(W, wt, val, n - 1);
		}
		else
		{
			return max(val[n - 1]
						+ knapSack(W - wt[n - 1], wt,
									val, n - 1),
					knapSack(W, wt, val, n - 1));
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int profit[] = new int[10];
		int weight[] = new int[10];
		int W,n;
		System.out.println("Enter the max weight: ");
		W = sc.nextInt();
		System.out.println("Enter the number of items: ");
		n = sc.nextInt();
		System.out.println("Enter the profit: ");
		for(int i=0;i<n;i++)
		{
			profit[i] = sc.nextInt();
		}
		System.out.println("Enter the respective weights: ");
		for(int i=0;i<n;i++)
		{
			weight[i] = sc.nextInt();
		}
		System.out.println(knapSack(W, weight, profit, n));
	}
}