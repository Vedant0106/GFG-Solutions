//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
    int count=0;

        String str=Integer.toBinaryString(n);

        StringBuilder sb = new StringBuilder(str);

        int len=str.length();

        for(int i=0;i<len;i++){

            if(str.charAt(i)=='0'){

                count=0;

                continue;

            }

            else{

                count++;

                if(count==3){

                    count=0;

                    sb.setCharAt(i,'0');

                }

            }

        }

        return Integer.parseInt(sb.toString(),2);


}
        
