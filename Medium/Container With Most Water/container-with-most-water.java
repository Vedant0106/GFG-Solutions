//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int A[], int len)
    {
        // Code Here
    int left=0;
    int right=len-1;
    int ans =0;
    while(left<right)
    {
        int tempwater=Math.min(A[left],A[right])*(right-left);
        ans=Math.max(ans,tempwater);
        if(A[left]<A[right])left++;
        else
        {
            right--;
        }
    }
    return ans;
    }
}
    