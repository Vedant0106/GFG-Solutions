//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long B = Long.parseLong(input_line[1]);

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<Long>();
            ans = ob.minimumSquares(L, B);
            System.out.print(ans.get(0)+" ");
            System.out.println(ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static List<Long> minimumSquares(long L, long B)

    {

        // code here

        long gcd = findGCD(L, B);

        List<Long> ans = new ArrayList<>();

        ans.add((L * B) / (gcd * gcd));

        ans.add(gcd);

        return ans;

    }

    

    static long findGCD(long a, long b) {

        if(b > a) {

            return findGCD(b, a);

        }

        while(a % b != 0) {

            long temp = b;

            b = a % b;

            a = temp;

        }

        return b;

    }

}