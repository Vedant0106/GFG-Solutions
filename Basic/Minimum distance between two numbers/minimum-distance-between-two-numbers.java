//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code here
        int xInd=-1;
        int yInd=-1;
        int dis=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
             xInd=i;   
            }
            if(arr[i]==y){
                yInd=i;
            }
            if(xInd!=-1 && yInd!=-1)
            dis=Math.min(dis,Math.abs(yInd-xInd));
        }
        if(xInd==-1 || yInd==-1)
         return -1;
        return dis;
    }
}
 