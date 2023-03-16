//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String secondSmallest(int S, int D){
        if(9*D<=S){
            return "-1";
        }
        else{
            int arr[] = new int[D];
            arr[0] = 1;
            int sum = 1;
            int i = D-1;
            while(sum<S && i>=0){
                arr[i]++;
                sum++;
                if(arr[i]==9){
                    i--;
                }
            }
            i = D-1;
            while(i>=0 && arr[i]==9){
                i--;
            }
            if(i+1<D)
                i++;
            if(i==0){
                return "-1";
            }
            else{
                arr[i]--;
                arr[i-1]++;
                String ans = "";
                for(i = 0;i < D;i++){
                    ans += arr[i];
                }
                return ans;
            }
        }
    }
}

