//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long findMax(int n, int m, long  a[], long b[], long k[])
    {
       // Your code goes here
       long arr[] =new long[n+1];
       for(int i=0;i<m;i++)
       {
           int start=(int)a[i];
           int end=(int)b[i];
           arr[start]+=k[i];
           arr[end+1]-=k[i];
       }
       long res=arr[0];
       for(int i=1;i<n;i++)
       {
           arr[i]+=arr[i-1];
           res=Math.max(res,arr[i]);
       }
       return res;
       
    }
}

//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int m =Integer.parseInt(q[1]);
            long a[] = new long[m];
            long b[] = new long[m];
            long c[] = new long[m];
            for (int i = 0; i < m; i++) {
                String line1 = br.readLine();
                String[] a1 = line1.trim().split("\\s+");
                a[i] = Integer.parseInt(a1[0]);
                b[i] = Integer.parseInt(a1[1]);
                c[i] = Integer.parseInt(a1[2]);
            }
            Solution ob = new Solution();
            long ans = ob.findMax(n,m,a,b,c);
            System.out.println(ans);
        }
    }
}






// } Driver Code Ends