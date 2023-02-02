//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    long largestcycle=-1;
    
    public long largesSumCycle(int N, int Edge[]){
        
      boolean[] visited = new boolean[N];
      boolean[] pathvisited = new boolean[N];
      
      for(int i=0;i<N;i++){
          
          if(!visited[i]){  DFS(i,Edge,visited,pathvisited);  }
          
      }
      
      return largestcycle;
        
    }
    
    void DFS(int node,int Edge[],boolean[] visited,boolean[] pathvisited){
      
      visited[node]=true;
      pathvisited[node]=true;
      
      if(Edge[node]!=-1){
          
          int adj=Edge[node];
          
          if(!visited[adj]){  DFS(adj,Edge,visited,pathvisited);  }
          else if(pathvisited[adj]){
              
              int curr=adj;
              long sum=0;
              
              do
              {
                  sum+=curr;
                  curr=Edge[curr];
              }while(curr!=adj);
              
              largestcycle=Math.max(largestcycle,sum);
              
          }
          
      }
      
      pathvisited[node]=false;
      
  }
  
}