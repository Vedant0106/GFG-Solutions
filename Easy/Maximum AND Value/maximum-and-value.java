//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    Solution obj = new Solution();
		    
		    System.out.println(obj.maxAND(arr, n));
		}
	}
}

// } Driver Code Ends



class Solution{
    
    // Function for finding maximum and value pair
    public static int maxAND (int arr[], int N) {
        // Complete the function
            int ans=0;
       for(int i=31;i>=0;i--)
       {
           int count=0;
           int curr = ans|(1<<i);
           for(int j=0;j<N;j++)
           {
               if((curr&arr[j])==curr)
                   count++;
           }
           if(count>=2)
               ans = curr;
       }
       return ans;
    }   
}
