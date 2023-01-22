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
            
            
            int[] arr = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.solve(N, K, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int solve(int N, int K, int[] arr) {
        // code here
        int sum = 0;
        for(int i : arr)
        sum+=i ;
        ArrayList<Integer>factor = new ArrayList<>() ;
        for(int i = 1;i*i<=sum;i++)
        {
            if(sum%i==0)
           { 
               factor.add(i) ;
            if(i!=sum/i)
            factor.add(sum/i) ;
           }
        }
        Collections.sort(factor) ;
        for(int i =1 ;i<arr.length ;i++){
          arr[i]= arr[i-1]+arr[i] ;
        }
        int ans = 0 ;
        for(int i = factor.size()-1;i>=0;i--)
        {
            int c  = 0 ;
            int tmp = factor.get(i) ;
            for(int j =0 ;j<N ;j++)
            {
                if(arr[j]%tmp==0)
                c++ ;
            }
            if(c>=K)
            {
               ans = tmp ;
                break;
            }
        }
        return ans ;
    }
}
        
