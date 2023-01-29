//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int currSum = 0;
        int count = 0;
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] == 0)
               currSum += -1;
            else
               currSum += 1;
               
            if(currSum == 0)
               count++;
            if(hm.containsKey(currSum)) 
            {
                count += hm.get(currSum);
                hm.put(currSum, hm.get(currSum) + 1);
            }
           else
           hm.put(currSum,1);
        }
        return count;
    }
}


