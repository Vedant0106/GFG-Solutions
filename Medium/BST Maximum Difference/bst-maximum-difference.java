//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t > 0){
	            int n=Integer.parseInt(br.readLine().trim());
	            String s[] = br.readLine().trim().split(" ");

	            int target=Integer.parseInt(br.readLine().trim());
    	    	Node root = null;
                for(int i=0;i<n;i++){
                    root=insert(root,Integer.parseInt(s[i]));
                }
        	    Solution g = new Solution();
        	    System.out.println(g.maxDifferenceBST(root,target));
                t--;
            
        }
    }

    public static Node insert(Node tree, int val) {
        Node temp = null;
        if (tree == null) return new Node(val);
    
        if (val < tree.data) {
            tree.left = insert(tree.left, val);
        } else if (val > tree.data) {
            tree.right = insert(tree.right, val);
        }
    
        return tree;
    }
  
}
// } Driver Code Ends

class Solution
{
    int min=Integer.MAX_VALUE;
    int sum=0;
    void find(Node root,int sum)
    {
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        {
            sum+=root.data;
            min=Math.min(min,sum);
        }
        sum+=root.data;
        find(root.left,sum);
        find(root.right,sum);
    }
    Node solve(Node root,int target,int sum)
    {
        if(root==null)
        return null;
        if(root.data==target)
        {
            this.sum=sum;
            return root;
        }
        if(root.data<target)
        return solve(root.right,target,sum+root.data);
        if(root.data>target)
        return solve(root.left,target,sum+root.data);
        return null;
    }
    public int maxDifferenceBST(Node root,int target)
    {
        min=Integer.MAX_VALUE;
        sum=0;
        Node targ=solve(root,target,0);
        if(targ==null)
        return -1;
        find(targ,0);
        return sum-min+target;
        
        
    }
}