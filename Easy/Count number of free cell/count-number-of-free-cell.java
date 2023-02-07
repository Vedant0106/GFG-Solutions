//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine().trim());
        while(T>0)
        {
            String s[]=in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int[][] a = new int[k][2];
            for(int i=0; i<k; i++){
                s=in.readLine().trim().split(" ");
                a[i][0] = Integer.parseInt(s[0]);
                a[i][1] = Integer.parseInt(s[1]);
            }
            Solution g = new Solution();
            long[] res = g.countZero(n,k,a);
            
            for(int i=0; i<res.length; i++){
                out.print(res[i]+" ");
            }
            out.println();
            T--;
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    long[] countZero(int n, int k, int[][] arr)
    {
        // code here
         HashSet<Integer> row = new HashSet<Integer>();
        HashSet<Integer> col = new HashSet<Integer>();
        long res[]= new long[k];
        for(int i=0;i<k;i++)
        {
            int currRow=arr[i][0];
            int currCol=arr[i][1];

            row.add(currRow);
            col.add(currCol);          
            int currRowCount=row.size();
            int currColCount=col.size();
            long currRes = n*n - ( n * ( currRowCount + currColCount ) - ( currRowCount * currColCount ) );
             res[i]=currRes;
        }
        return res;
    }
}