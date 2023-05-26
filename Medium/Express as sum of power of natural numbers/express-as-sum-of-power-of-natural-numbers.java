//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int x = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numOfWays(n, x));
        }
    }
}

// } Driver Code Ends


class Solution
{
    public static int mod = 1000000007;
    public static int fun(int ind, int n, int x, int [][] dp){
        if(ind > n){
            if(n == 0) return 1;
            return 0;
        }
        if(dp[ind][n] != -1) return dp[ind][n];
        int pick=0;
        if(n>0){
            pick = fun(ind+1, n-(int)Math.pow(ind,x), x, dp);
        }
        int notpick = fun(ind+1, n, x, dp);
        return dp[ind][n] = (pick+notpick)%mod;
    }
    static int numOfWays(int n, int x)
    {
        int [][] dp = new int[n+1][n+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }
        return fun(1, n, x, dp);
    }
}