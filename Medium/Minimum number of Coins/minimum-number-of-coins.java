//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int n)
    {
        // code here
         TreeSet<Integer>t=new TreeSet<Integer>();
        t.add(1);
        t.add(2);
        t.add(5);
        t.add(10);
        t.add(20);
        t.add(50);
        t.add(100);
        t.add(200);
        t.add(500);
        t.add(2000);
        ArrayList<Integer>ans=new ArrayList<Integer>();
        while(n>0)
        {
            int temp=t.floor(n);
            n=n-temp;
            ans.add(temp);
        }
        return ans;
    }
}