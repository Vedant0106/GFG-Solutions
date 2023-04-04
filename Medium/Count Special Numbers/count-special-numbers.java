//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }
    
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt(); // Inputting the testcases
        PrintWriter out = new PrintWriter(System.out);
        while (t-- > 0) {

            int i = 0;
            int N = sc.nextInt();

            int arr[] = new int[(int)(N)];

            for (i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            out.println(ob.countSpecialNumbers(N, arr));
        }
        out.flush();
    }
}

// } Driver Code Ends


class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<N;i++){
            
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            
        }
        for(int i=0;i<N;i++){
            
            int temp=arr[i];
            for(int j=1;j*j<=temp;j++){
                if(temp%j==0){
                    // System.out.println(j);
                    if(temp!=j && hm.containsKey(j)){
                        
                        ans++;
                        break;
                    }
                    else if(temp==j &&  hm.get(j)>1){
                        ans++;
                        break;
                        
                    }
                    if(temp/j!=j){
                        // System.out.println(temp/j);
                        if(temp!=temp/j && hm.containsKey(temp/j)){
                            ans++;
                            break;
                        }
                        else if(temp==temp/j &&  hm.get(temp/j)>1){
                            ans++;
                            break;
                            
                        }
                    }
                }
            }
            
        }
       
        return ans;
    }
}