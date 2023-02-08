//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] pre = new long[n];
        long[] suf = new long[n];
        long[] res = new long[n];
        pre[0] = 1;
        suf[n-1] = 1;

       for(int i = 1 ; i < n ; i++)
          pre[i] = pre[i-1] * nums[i-1];

       for(int j = n-2 ; j>=0 ; j--)
          suf[j] = suf[j+1] * nums[j+1];

       for(int i = 0 ; i < n ; i++)
       {
           res[i] = pre[i]*suf[i];
       }
       return res;
    } 
} 