//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [][] costs = new int[n][k];
			for(int i = 0; i < n; i++) {
				str = br.readLine().trim().split(" ");
				for(int j = 0; j < k; j++) {
					costs[i][j] = Integer.parseInt(str[j]);
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.minCost(costs));
		}
	}
}

// } Driver Code Ends

class Solution{

 int minCost(int [][] costs) {

 int N = costs.length;

 int K = costs[0].length;

 if(K == 1 && N > 1) return -1;

 if(K == 1 && N == 1) return costs[0][0];

 int [][] dp = new int[N][K];

 for(int i=0; i<K; i++) dp[0][i] = costs[0][i];

 for(int i=1; i<N; i++){

     int least = Integer.MAX_VALUE;

     int sleast = Integer.MAX_VALUE;

     for(int j=0; j<K; j++){

         if(dp[i-1][j] <= least) {

             sleast = least;

             least = dp[i-1][j];

         }

         else if(dp[i-1][j] <= sleast) sleast = dp[i-1][j];

     }

     for(int j=0; j<K; j++){

         if(dp[i-1][j] == least)  dp[i][j] = costs[i][j] + sleast;

         else  dp[i][j] = costs[i][j] + least;

        

     }

     

 }

     int ans = dp[N-1][0];

     for(int i=0; i<K; i++) ans = Math.min(ans, dp[N-1][i]);

     return ans;

 }

}