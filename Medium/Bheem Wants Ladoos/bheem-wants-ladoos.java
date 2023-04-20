//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
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

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t > 0){
            String line = br.readLine().trim();
            Node root = buildTree(line);
            
            line = br.readLine().trim();
            String target_k[] = line.split(" ");
            int home = Integer.parseInt(target_k[0]);
            int k = Integer.parseInt(target_k[1]);
            
            Solution x = new Solution();
            System.out.println( x.ladoos(root, home, k) );
            t--;
        }
    }
}


// } Driver Code Ends

class Solution{
    static int ladoos(Node root, int home, int k){
        Map<Node,Node> pMap=new HashMap<>();
        fillParentMap(pMap,null,root);
        
        Node targetNode=searchNode(root,home);
        
        return bfsTraversal(new HashSet<>(),pMap,targetNode,k);
        
    }
    static void fillParentMap(Map<Node,Node> pMap,Node parent,Node root){
        if(root==null){
            return;
        }
        pMap.put(root,parent);
        fillParentMap(pMap,root,root.left);
        fillParentMap(pMap,root,root.right);
    }
    
    static Node searchNode(Node root,int target){
        if(root==null || root.data==target){
            return root;
        }
        Node left=searchNode(root.left,target);
        if(left!=null){
            return left;
        }
        return searchNode(root.right,target);
    }
    
    static int bfsTraversal(Set<Node> vis,Map<Node,Node>pMap,Node root,int k){
        int sum=0;
       
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        vis.add(root);
        
        while(q.size()>0 && k-->=0){
            int size=q.size();
            
            while(size-->0){
                Node curr=q.remove();
                
                Node par=pMap.get(curr);
                Node left=curr.left;
                Node right=curr.right;
                
                sum+=curr.data;
                if(par!=null && vis.contains(par)==false){
                    vis.add(par);
                    q.add(par);
                }
                
                if(left!=null && vis.contains(left)==false){
                    vis.add(left);
                    q.add(left);
                }
                
                if(right!=null && vis.contains(right)==false){
                    vis.add(right);
                    q.add(right);
                }
            }
        }
        
        return sum;
    }
    
}

