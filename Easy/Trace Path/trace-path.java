//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends


// User function Template for 

class Solution{
    static int isPossible(int n, int m, String s){
        int l = 0, h = 0, lmin = 0, lmax = 0, hmax = 0, hmin = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'L') l--;
            else if(ch == 'U') h++;
            else if(ch == 'R') l++;
            else h--;
            
            if(l<lmin) lmin = l;
            if(h<hmin) hmin = h;
            if(hmax < h) hmax = h;
            if(lmax < l) lmax = l;
            
            if(Math.abs(lmax-lmin) >= m) return 0;
            if(Math.abs(hmax-hmin) >= n) return 0;
        }
        
        return 1;
    }
}