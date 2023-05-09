//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.totalCuts(N, K, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int totalCuts(int n, int k, int[] arr) {
        // code here
            if(n==0||n==1)
        return 0;
        if(n==2)
        {
            if(arr[0]+arr[1]>=k)
            return 1;
        }
        //finding the max value in left of the element
        int leftmax[]=new int[n];
        int rightmin[]=new int[n];
        leftmax[0]=arr[0];
        int ans=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
            leftmax[i]=ans;
        }
        //finding the min value in the right of the element
        rightmin[n-1]=arr[n-1];
        ans=arr[n-1];
        for(int i=n-2;i>=0;i-- )
        {
           if(arr[i]<ans) 
           ans=arr[i];
           
           rightmin[i]=ans;
        }
        //find the count of such elements
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            int sum=leftmax[i]+rightmin[i+1];
            if(sum>=k)
            count++;
        }
        return count;
    }
}
        
