//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
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