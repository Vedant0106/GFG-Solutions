//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
         int cnt = 0;
        int ans = 0;
        int st = 0;
        int en = 0;

        while (en < arr.length()) {
            while (cnt > m) {
                if (arr.charAt(st) == 'O') {
                    cnt--;
                }
                st++;
            }

            if (arr.charAt(en) == 'O') {
                cnt++;
            }

            if (cnt <= m) {
                ans = Math.max(ans, en - st + 1);
            }
            en++;
        }

        return ans;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends