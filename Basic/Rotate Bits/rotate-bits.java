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
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList <>();

        if(D > 16) {

            D %= 16;

        }

        int a = ((N<<D) | (N>>(16 - D))) & (int)Math.pow(2, 16) - 1;

        int b = ((N>>D) | (N<<(16 - D))) & (int)Math.pow(2, 16) - 1;

        list.add(a);

        list.add(b);

        return list;
    }
}