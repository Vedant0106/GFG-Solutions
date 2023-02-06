//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0)
		{
		    long n=ob.nextLong();
		    Solution ab=new Solution();
		    long k=ab.findNth(n);
		    System.out.println(k);
		}
	}
}

    

// } Driver Code Ends


//User function Template for Java

class Solution 
{
    long findNth(long N)
    {
        //code here
    long c=0;
    long P = 1;
    while(N>0)
    {
        c+=(P*(N%9));
        N=N/9;
        P=P*10;
    }
    return c;
    }
}