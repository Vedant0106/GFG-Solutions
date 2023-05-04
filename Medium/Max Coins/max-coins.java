//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG implements Runnable
{
    public static void main(String args[])throws IOException
    {
        new Thread(null, new GFG(), "whatever", 1<<26).start();
    }
    public void run()
    {
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t=Integer.parseInt(in.readLine());
            while(t-->0){
                int n=Integer.parseInt(in.readLine().trim());
                int a[][]=new int[n][3];
                for(int i=0;i<n;i++){
                    String s[]=in.readLine().trim().split(" ");
                    a[i][0]=Integer.parseInt(s[0]);
                    a[i][1]=Integer.parseInt(s[1]);
                    a[i][2]=Integer.parseInt(s[2]);
                }
                Solution ob=new Solution();
                out.println(ob.maxCoins(n,a));
            }
            out.close();
        }catch(Exception e){
            ;
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    public static int maxCoins(int n,int ranges[][])
    {
      Arrays.sort(ranges,new Comparator<int[]>()
      {
            public int compare(int a[],int b[]){
                if(a[0]==b[0])return a[1]-b[1];
                return a[0]-b[0];
            }
        });
        int temp[] = new int[n];
        temp[n-1]=ranges[n-1][2];
        for(int i=n-2;i>=0;i--)temp[i]=Math.max(temp[i+1],ranges[i][2]);
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=ranges[i][2];
            int low = i+1,high=n-1,t=0;
            while(low<=high){
                int mid = (low+high)/2;
                if(ranges[mid][0]>=ranges[i][1]){
                    t=temp[mid];
                    high=mid-1;
                }
                else low=mid+1;
            }
            sum+=t;
            ans=Math.max(sum,ans);
        }
        return ans;


    }
}