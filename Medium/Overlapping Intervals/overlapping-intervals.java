//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        ArrayList<int[]> ls=new ArrayList<>();
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
        ls.add(Intervals[0]);
        int prev[]=ls.get(0);
        for(int i=1;i<Intervals.length;i++){
            int curr[] = Intervals[i];
            if(curr[0] <= prev[1]){
                prev[1] = Math.max(prev[1],curr[1]);
            }else{
                ls.add(curr);
                prev=curr;
            }
        }
        return ls.toArray(new int[ls.size()][]);
    }
}