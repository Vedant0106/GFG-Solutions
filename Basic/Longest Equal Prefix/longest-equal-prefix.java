//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class GFG
{
    long findIndex(long arr[] ,int X,int Y,int N)
    {
        
        // Your code goes here
         long ans = -1;
        int x_count = 0;
        int y_count = 0;
        
        for(int i=0; i<N; i++){
            if((int)arr[i] == X){
                x_count++;
            }
            if((int)arr[i] == Y){
                y_count++;
            }
            if(x_count == y_count && x_count > 0 && y_count > 0){
                ans = i;
            }
        }
        
        return ans;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
//            int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int x =Integer.parseInt(a2[1]);
            int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            GFG ob=new GFG();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.findIndex(a,x,y,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends