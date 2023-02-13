//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
         Set<Character> s1 = new HashSet<>();

        Set<Character> s2 = new HashSet<>();

        TreeSet<Character> s3 = new TreeSet<>();

        StringBuilder ans = new StringBuilder();

 

        for(int i=0; i<A.length(); i++){

            s1.add(A.charAt(i));

        }

         for(int i=0; i<B.length(); i++){

            s2.add(B.charAt(i));

        }

        for(int i=0; i<A.length(); i++){

            if(!s2.contains(A.charAt(i))){

               s3.add(A.charAt(i)); 

            }

        }

        for(int i=0; i<B.length(); i++){

            if(!s1.contains(B.charAt(i))){

               s3.add(B.charAt(i)); 

            }

        }

        Iterator value = s3.iterator();

        while (value.hasNext()){

            ans.append(value.next());

        }

        if(s3.isEmpty()){

            return "-1";

        }

        return ans.toString();
    }
}