//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String s[] = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution soln = new Solution();
            soln.zigZag(a, n);
            boolean bool = isZigZag(a, n);
            if(bool)
                ot.println(1);
            else
                ot.println(0);
        }
        ot.close();
    }
    static boolean isZigZag(int a[], int n){
        boolean flag = true;
        for(int i = 1; i < n; i++){
            if(flag){
                if(a[i - 1] > a[i])
                    return false;
            } else{
                if(a[i - 1] < a[i])
                    return false;
            }
            flag = !flag;
        }
        return true;
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void zigZag(int arr[], int n) 
    {
        // code here
        for(int i=0;i<n-1;i++)
       {
           if(i%2==0)
           {
               if(arr[i]>arr[i+1])
               swap(arr,i,i+1);
           }else
           {
               if(arr[i]<arr[i+1])
               swap(arr,i,i+1);
           }
       }
      
   }
   void swap(int arr[],int i,int j)
   {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   }
        
    

}