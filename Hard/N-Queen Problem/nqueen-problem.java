//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
           ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        int[][] chess = new int[n][n];
        solve(chess, 0, n, al, ans);
        return ans;

    }

    static void solve(int[][] chess, int r, int n, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ans)
    {
        if(r==n){
            ans.add(new ArrayList<>(al));
            return;
        }        
        for(int c=0; c<n; c++){
            if(isSafe(chess, r, c, n)){
                chess[r][c] = 1;
                al.add(c+1);
                solve(chess, r+1, n, al, ans);
                chess[r][c]=0;
               al.remove(al.size()-1);
            }
        }
    }
    static boolean isSafe(int[][] chess, int r, int c, int n){        
        //checking left diagonal
        int i=r, j=c;
        while(i>=0 && j>=0){
            if(chess[i][j]==1)
                return false;
            i--; j--;             
        }
        //checking right diagonal
        i=r; j=c;
        while(i>=0 && j<n){
            if(chess[i][j]==1)
                return false;
            i--; j++;             
        }                         
        //checking column 
        i=r; j=c;
        while(j>=0){
            if(chess[i][j]==1)
                return false;
            j--;    
        }
        //checking row
        i=r; j=c;
        while(i>=0){
            if(chess[i][j]==1)
                return false;
            i--;    
        }
        return true;
    }
}