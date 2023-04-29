//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine().trim());
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                a[i][0]=Integer.parseInt(s[0]);
                a[i][1]=Integer.parseInt(s[1]);
            }
            int k=Integer.parseInt(in.readLine().trim());
            Solution ob=new Solution();
            out.println(ob.powerfullInteger(n,a,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    public static int powerfullInteger(int n,int interval[][],int k)
    {
       TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<n;i++){
            tm.put(interval[i][0],tm.getOrDefault(interval[i][0],0)+1);
            tm.put(interval[i][1]+1,tm.getOrDefault(interval[i][1]+1,0)-1);
        }
        int temp=0;
        int ans=0;
        for(Map.Entry<Integer,Integer> e:tm.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value>=0){
                temp+=value;
                if(temp>=k){
                    ans=key;
                }
            }else if(value<0){
                if(temp>=k){
                    ans=key-1;
                }
                temp+=value;
            }
        }
        return (ans==0?-1:ans);
    }
}