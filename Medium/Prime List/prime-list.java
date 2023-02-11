//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    boolean isPrime(int p) {
        if(p <= 1) return false;
        
        for (int i=2; i*i <= p; i++) {
            if(p % i == 0) return false;
        }
        return true;
    }
    
    int getNearestPrime(int num) {
        if(isPrime(num)) return num;
        
        int left = num-1, right = num+1;
        
        while(left >= 0 && !isPrime(left)) { left--; }
        while(!isPrime(right)) { right++; }
        
        if(left < 0) return right;
        
        return num-left <= right-num ? left : right;
    }
    
    Node primeList(Node head) {
        Node temp = head;
        
        while(temp != null) {
            temp.val = getNearestPrime(temp.val);
            temp = temp.next;
        }
        return head;
    }}