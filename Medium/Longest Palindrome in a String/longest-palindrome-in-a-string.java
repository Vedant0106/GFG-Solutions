//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int n = S.length();
        if(n == 1) return S;

        for(int i = n; i > 0; i--)
        {
            for(int j = 0; j<n-i+1; j++)
            {
                String x = S.substring(j, i+j);
                String revx = new StringBuilder(x).reverse().toString();

                if(x.equals(revx)) return x;
            }
        }
        return "";
    }
}