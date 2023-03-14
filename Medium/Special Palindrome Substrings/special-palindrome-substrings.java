//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    int ans = obj.specialPalindrome(s1,s2);
		    System.out.println(ans);
		    
		    
		    
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public  static int specialPalindrome(String a, String b){
       //Code Here
       char s1[] = a.toCharArray(), s2[] = b.toCharArray();
       int l1 = s1.length, l2 = s2.length, ans = Integer.MAX_VALUE;
       for(int i=0 ; i<l1-l2+1 ; i++){
           char temp[]=(a.substring(0,i)+b+a.substring(i+l2)).toCharArray();
           int cost=0;
            // calculate cost to place s2
            for(int j=i ; j<i+l2 ; j++){
                if(s1[j]!=temp[j])
                    cost++;
            }
            int z=0;
            for(int j=0 ; j<Math.ceil(l1/2.0) ; j++){
    
                if((j<i || j>=i+l2) && temp[j]!=temp[l1-j-1]) // if s2 is in the first half of new string
                    cost++;
                else if(temp[j]!=temp[l1-j-1] && (l1-j-1<i || l1-j-1>=i+l2)) // if s2 is in the second half of new string
                    cost++;
                else if(temp[j]!=temp[l1-j-1]){ // if s2 is in both halves
                    z=1;
                    break;
                }
            }
            if(z==0)
                ans=Math.min(ans,cost);
       }
       if(ans == Integer.MAX_VALUE){
          return -1;
        }
        return ans;
    }
}