//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	      int[] dp = new int[1000000];
    int sum = 1;
    while(sum <= V)
    {
        dp[sum] = Integer.MAX_VALUE;
        for(int m : coins) 
        {
            if(sum >= m && dp[sum-m] != Integer.MAX_VALUE)
                dp[sum] = Math.min(dp[sum], dp[sum - m] + 1);
        }
        sum++;
    }
    return dp[V] == Integer.MAX_VALUE ? -1 : dp[V];
	} 
}