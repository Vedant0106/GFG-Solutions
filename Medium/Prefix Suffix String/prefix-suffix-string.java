//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends


class TrieNode{
    boolean isEnd;
    TrieNode children[];
    TrieNode(){
        children=new TrieNode[26];
        Arrays.fill(children,null);
        isEnd=false;
    }
}
class Solution
{
    
    public void insert(TrieNode root,String str)
    {
        TrieNode child=root;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(child.children[ch-'a']==null){
                child.children[ch-'a']=new TrieNode();
            }
            child=child.children[ch-'a'];
        }
    }
    public boolean find(TrieNode root,String s2)
    {
        TrieNode child=root;
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(child.children[ch-'a']==null){
                return false;
            }
            child=child.children[ch-'a'];
        }
        return true;
    }
    
    public int prefixSuffixString(String s1[],String s2[])
    {
        TrieNode root=new TrieNode();
        for(int i=0;i<s1.length;i++){
            insert(root,s1[i]);
            StringBuilder str=new StringBuilder(s1[i]);
            String reverseString=str.reverse().toString();
            insert(root,reverseString);
        }
        int count=0;
        for(int i=0;i<s2.length;i++){
            StringBuilder str=new StringBuilder(s2[i]);
            String revStr=str.reverse().toString();
            if(find(root,s2[i])||find(root,revStr)){
                count++;
            }
        }
        return count;
    }
}