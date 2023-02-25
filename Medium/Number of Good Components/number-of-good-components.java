//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int E = Integer.parseInt(s[0]);
            int V = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i <= V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            int ans = obj.findNumberOfGoodComponent(V, adj);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {

    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {

        

       boolean vis[] = new boolean[V+1];

       int res=0;

       for(int i = 1; i<=V; i++){

           if(!vis[i] &&bfs(adj,i,vis))

               res++; 

         

       }

       return res;

    }

    

    boolean bfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis){

        Queue<Integer>q = new LinkedList<>();

       

       q.add(node);

        vis[node]= true;

        int size = adj.get(node).size(),cnt =1;

        boolean flag  = true;

        

        while(!q.isEmpty()){

            int x = q.poll();

            if(adj.get(x).size() != size)flag = false;

            for(int i = 0; i<adj.get(x).size(); i++){

                if(!vis[adj.get(x).get(i)]){

                    cnt++;

                    vis[adj.get(x).get(i)] = true;

                    q.add(adj.get(x).get(i));

                }

            }

        }

        

        return flag && cnt == size+1;

    }

    

}