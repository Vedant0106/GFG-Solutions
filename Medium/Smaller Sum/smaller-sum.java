//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long ans[] = new long[n];
        int temp[] = arr.clone();
        Arrays.sort(temp);
        long s[] = new long[n];
        //long sum = 0;
        for(int i=1;i<n;i++){
            //sum += temp[i];
            s[i] = s[i-1] + temp[i-1];
        }
        for(int i=0;i<n;i++){
            int l = 0;
            int h = n-1;
            while(l<h){
                int mid = (l+h)/2;
                if(temp[mid] == arr[i] || temp[mid] > arr[i]){
                    h = mid;
                }
                else{
                    l = mid + 1;
                }
            }
            ans[i] = s[h];
        }
        return ans;
    }
}