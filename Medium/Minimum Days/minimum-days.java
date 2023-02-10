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
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            String S;
            S = br.readLine();
            
            
            int[] P = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.getMinimumDays(N, S, P);
            
            out.println(res);
            
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
        // code here
     int l=0;
         int r=N-1;
         int ans=0;
         while(l<=r){
             int mid=(l+r)/2;
             char arr[]=S.toCharArray();
             for(int i=0;i<=mid;i++){
                 arr[P[i]]='?';
             }
             boolean flag=true;
             for(int i=0;i<N-1;i++){
                 if(arr[i]!='?' && arr[i]==arr[i+1])
                   {
                       flag=false;
                       break;
                   }
             }
             if(flag)
             {
                 r=mid-1;
                 ans=mid;
             }
             else
             l=mid+1;
         }
         if(ans==0)
         return 0;
         return ans+1;
    }
}
