//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution

{

 public static int countPaths(int N){

 long mod=1000000007l;

        long low=1l,high=0l;

        long tlow=1l,thigh=0l;

        for(int i=2;i<=N;i++)

        {

            high=(3*tlow)%mod;

            low=(((2*tlow)%mod)+thigh)%mod;

            tlow=low;

            thigh=high;

        }

        return (int)high;

 }

 

}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countPaths(N));
        }
    }
}

// } Driver Code Ends