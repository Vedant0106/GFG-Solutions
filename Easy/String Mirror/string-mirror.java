//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        StringBuilder sb = new StringBuilder();
        char c='\u0000';
        
        for(int i=0;i<str.length();i++){
            if(c=='\u0000' || str.charAt(i)<=c){
               if(str.charAt(i)==c && i==1) break;
               sb.append(str.charAt(i)); 
               c=str.charAt(i);
            } 
            else break;
        }
        return resString(sb);
    }
    
    public static String resString(StringBuilder sb){
        
        StringBuilder sn= new StringBuilder(sb);
        for(int i=sb.length()-1;i>=0;i--) sn.append(sb.charAt(i));
        return sn.toString();
        
    }
}