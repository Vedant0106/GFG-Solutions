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
int minCoins(int arr[], int n, int sum) 
{ 
	    int dp[][]=new int[n+1][sum+1] ; 
	    for(int i=0 ; i<=n ; i++)
	    {
	        dp[i][0]=0 ; 
	    }
	    for(int i=1 ; i<=sum ; i++)
	    {
	        dp[0][i]=sum+100 ; 
	    }
	    for(int i=1 ; i<=n ; i++)
	    {
	        for(int j=1 ; j<=sum ; j++)
	        {
	            if(arr[i-1]<=j){
	                dp[i][j] = Math.min(dp[i][j-arr[i-1]]+1,dp[i-1][j]) ;
	            }
	            else{
	                dp[i][j] = dp[i-1][j] ;
	            }
	        }
	    }
	    return dp[n][sum]==sum+100?-1:dp[n][sum] ;
	}
}