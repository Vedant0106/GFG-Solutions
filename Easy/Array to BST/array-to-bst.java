//{ Driver Code Starts
//Initial Template for Java

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
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int i =0;
    int ans [] ;
    void fun(int nums[],int L,int R)
    {
        if(L>R)
        {   return; }
        int mid =  (L+R)/2;
        ans[i]= nums[mid];
        i++;
        fun(nums,L,mid-1);
        fun(nums,mid+1,R);
    }
    
    
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        int N=nums.length;
        // assign an array of size nums length
        ans = new int[N];
        N=N-1;
        int mid = (0+N)/2;
        ans[i]= nums[mid];
        i++;
        fun(nums,0,mid-1);
        fun(nums,mid+1,N);
        return ans;
    }
}