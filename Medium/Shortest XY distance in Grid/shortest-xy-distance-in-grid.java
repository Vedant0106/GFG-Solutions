//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int m,
                              int n) {

        //code here
        int mini=Integer.MAX_VALUE;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid.get(i).get(j)=='X')
                pq.offer(new int[]{i,j,0});
            }
        }
        boolean visited[][]=new boolean[m][n];
        while(!pq.isEmpty())
        {
            int x[]=pq.poll();
            i=x[0];j=x[1];
            int level=x[2];
            if(visited[i][j])
            continue;
            visited[i][j]=true;
            if(grid.get(i).get(j)=='Y') return level;
            if(valid(i+1,j,m,n))
            pq.offer(new int[]{i+1,j,level+1});
            if(valid(i-1,j,m,n))
            pq.offer(new int[]{i-1,j,level+1});
            if(valid(i,j+1,m,n))
            pq.offer(new int[]{i,j+1,level+1});
            if(valid(i,j-1,m,n))
            pq.offer(new int[]{i,j-1,level+1});
        }
        return -1;
    }
};