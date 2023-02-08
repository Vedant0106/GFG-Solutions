//{ Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.canJump(N));
        }
    }
}
// } Driver Code Ends



class Solution {
    static String canJump(Long N) {
        // code here
        return (N&(N-1))==0 ? "True":"False";
    }
};