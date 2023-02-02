//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S[] = read.readLine().split(" ");
            int[] Arr = new int[N];
            for(int i=0 ; i<N ; i++)
                Arr[i]=Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.getTwinCount(N,Arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getTwinCount(int N , int[] Arr) {
        // code here
         int count=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<N;i++){
           map.put(Arr[i],map.getOrDefault(Arr[i],0)+1);
       }for(int i:map.keySet()){
           if(map.get(i)%2==0){
               count+=map.get(i);
           }else{
               count+=map.get(i)-1;
           }
       }
       return count;
    }
};