//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // Done by: Shashank
        boolean vis[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(isCyclic(i, adj, vis, recStack)) return true;
            }
        }
        return false;
    }
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean recStack[]){
        vis[v] = true; recStack[v] = true;
        for(Integer neighbour : adj.get(v)){
            if(!vis[neighbour]){
                if(isCyclic(neighbour, adj, vis, recStack)) return true;
            }else if(recStack[neighbour]) return true;
        }
        recStack[v] = false;
        return false;
    }
}