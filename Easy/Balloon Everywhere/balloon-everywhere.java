//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch))
          map.put(ch,map.get(ch)+1);
        }
        
        map.put('l',map.get('l')/2);
        map.put('o',map.get('o')/2);
        
        int ans=Integer.MAX_VALUE;
        for(int e:map.values()){
             if(e==0) return 0;
            ans=Math.min(e,ans);
        }
        
        return ans;
    }
}