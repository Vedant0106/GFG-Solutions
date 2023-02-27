//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException
    {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for(int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));

        return head;
    }

    public static void printList(Node node)
    {
        while (node != null)
        {
    		System.out.print(node.data + " ");
    		node = node.next;
    	}
    	System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node head = Node.inputList(br);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            Node res = obj.reverse(head, k);
            
            Node.printList(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {

    

    static Node   reversee(Node head ){

        

        

        Node curr= head;

        

        Node prev=null ;

        Node temp = curr.next ;

        

        while(curr!= null ){

            

            curr.next = prev ;

            prev= curr;

            curr= temp ;

            if(temp!= null ){

                temp = temp.next ;

                

            }

            

        }

        

         return prev ;

        

        

    }

    

    

    public static Node reverse(Node head, int k) {

        // code here

        

        int i=1 ;

        

        Node temp = head;

        Node tempp= head;

        while(i<k && temp!=null ){

            

            temp = temp.next ;

            i++;

        }

        

        if(temp!=null ){

            

             Node nextt = temp.next ;

       temp.next = null ;

        

        Node head1 = reversee(tempp);

     

     Node head2= reversee(nextt);

     tempp.next=head2 ;

     

     return head1 ;

      

            

        }

   

      return reversee(head);

        

    }

}

        

   
