package Dp;
import java.util.Arrays;

public class MinCoinsDP {

	static int count = 1;
	public static void main(String[] args) {
		
		// Using Dynamic Programming 
		int n = 18;
		int a[] = {7,5,1};
		long dp[] = new long[n+1];
		Arrays.fill(dp,-1);
		dp[0] = 0;
		
		long ans = minCoins(n,a,dp);
		System.out.println(ans);
		
		// Printing the DP Array now 
		for(int i=0;i<dp.length;i++)
		{
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		minCoins(n,a,dp);
		System.out.println(count);
	}
	static long minCoins(int n,int a[],long[] dp)
	{
		if(n==0) return 0;
		long ans = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			long subAns = 0;
			if(n-a[i] >= 0)
			{
				if(dp[n-a[i]]!=-1)
				{
					subAns = dp[n-a[i]];
				}
				else
				{
					subAns = minCoins(n-a[i],a,dp);
				}
				if(subAns + 1 < ans && subAns!=ans)
				{
					ans = subAns + 1;
				}
				if(n-a[i]==0)
				{
					count++;
				}
			}
		}
		dp[n] = ans;
		return dp[n];
	}
}
