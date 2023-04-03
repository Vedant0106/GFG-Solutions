//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String str = br.readLine();
			Solution obj = new Solution();
			System.out.println(obj.minSteps(str));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
int minSteps(String str) {
        
        int ans=0;
        int a=0,b=0;
        boolean flaga=false,flagb=false;
        int i=0;
        while(i<str.length()){
           
           flaga=false;
           flagb=false;
           if(str.charAt(i)=='a'){
               int k=i;
               while(k<str.length() && str.charAt(k)!='b'){
                   flaga=true;
                   a++;
                   k++;
               }
               int j=k;
               
               while(j<str.length() &&str.charAt(j)!='a'){
                   flagb=true;
                   b++;
                   j++;
               }
              
               if(flaga && flagb){
                   ans++;
               }
               i=j;
           }
           else{
               int k=i;
               while(k<str.length() &&str.charAt(k)!='a'){
                   flagb=true;
                   b++;
                   k++;
               }
                 int j=k;
               while(j<str.length() && str.charAt(j)!='b'){
                   flaga=true;
                   a++;
                   j++;
               }
               if(flaga && flagb){
                   ans++;
               }
               i=j;
           }
          
           
         }
       // System.out.println(a+" "+b);
         if(flaga || flagb){
             ans++;
         }
       //  if(a==b || b>a)ans++;
       
        return ans;
    
	}
}