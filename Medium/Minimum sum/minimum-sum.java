//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java





class Solution {
    String solve(int[] arr, int n) {
        // code here
       if(n==1)

        return Integer.toString(arr[0]);

        

        Arrays.sort(arr);

          StringBuilder s = new StringBuilder("");

          StringBuilder res = new StringBuilder("") ;

        int carry=0;

        int sum=0;

       

         for(int i=n-1;i>0;i-=2){

             sum=arr[i]+arr[i-1]+carry;

             s.append(sum%10);

             carry=sum/10;

              

         }

          if(n%2!=0){

              sum=arr[0]+carry;

           s.append(sum%10);

              carry=sum/10;

           }

           

           if(carry!=0)

               s.append(carry);

 

         int i=s.length()-1;

         while(s.charAt(i)=='0')

            i--;

         for(;i>=0;i--)

         res.append(s.charAt(i));

         return res.toString();
    }
}
