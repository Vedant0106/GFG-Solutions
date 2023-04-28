//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            char c[][]=new char[n][m];
            for(int i=0;i<n;i++){
                s=in.readLine().trim().split(" ");
                for(int j=0;j<m;j++){
                    c[i][j]=s[j].charAt(0);
                }
            }
            Solution ob=new Solution();
            int ans[][]=ob.chefAndWells(n, m, c);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    out.print(ans[i][j]+" ");
                }
                out.println();
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    private static final int INF = 1_000_000_000;
    private static final int[] d = {0, 1, 0, -1, 0};
    
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        int[][] dis = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (c[i][j] == 'W') {
                    q.add(new int[]{i,j});
                } else {
                    dis[i][j] = INF;
                }
            }
        }
        
        while (!q.isEmpty()) {
            int[] u = q.poll();
            int x = u[0], y = u[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + d[i];
                int ny = y + d[i + 1];
                
                if (isValid(nx, ny, n, m) && c[nx][ny] != 'N' && dis[x][y] + 1 < dis[nx][ny]) {
                    dis[nx][ny] = dis[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (c[i][j] == 'H') {
                    dis[i][j] = (dis[i][j] == INF) ? -1 : dis[i][j] * 2;
                } else {
                    dis[i][j] = 0;
                }
            }
        }
        
        return dis;
    }
    
    private boolean isValid(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}