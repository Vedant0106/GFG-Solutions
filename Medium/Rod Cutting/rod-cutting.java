//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int dp[]= new int [n+1];
        for(int i=1; i<=n;i++)
        {
            for(int j =0; j<i; j++)
            {
                dp[i]= Math.max(dp[i],price[j]+dp[i-j-1]);
            }
        }
        return dp[n];
    }
}