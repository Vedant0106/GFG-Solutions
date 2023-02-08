//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
         int N=S.length();
         int M=pat.length();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < N-M+1 ; i++)
        {
            if(pat.charAt(0) == S.charAt(i))
            {
                if(S.substring(i , i+M).equals(pat))
                {
                    arr.add(i+1);
                }
            }
        }
        if(arr.size() == 0 ){
            arr.add(-1);
        }
        return arr;
    }
}