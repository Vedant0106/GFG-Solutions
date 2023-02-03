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
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
   final static int mod = 1000000007;
    public long countFriendsPairings(int n) {
       if(n==1 || n==2) return n;
        long[] dp=new long[4];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= n; i++) {
            dp[3]= (dp[2] + ((i-1)*dp[1])%mod)%mod;
            dp[1]=dp[2];
            dp[2]=dp[3];
        }
        return dp[3];
    }
};
