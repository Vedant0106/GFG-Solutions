//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.dominantPairs(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int dominantPairs(int n, int[] arr) {
        // code here
            int dominantPairsCount = 0;
    
    // Sort the first half of the array in non-decreasing order
    Arrays.sort(arr, 0, n/2); 
    
    // Sort the second half of the array in non-increasing order
    Arrays.sort(arr, n/2, n); 
    
    // Initialize two pointers, i and j, to the first element of their respective halves
    int i = 0, j = n/2;
    
    // Iterate over both halves of the array simultaneously using two pointers
    while (i < n/2 && j < n) {
        // Check if the current pair satisfies the condition for dominance
        if (arr[i] >= 5 * arr[j]) {
            /*If yes, increment the dominantPairsCount by the number of elements 
            remaining in the second half*/
            dominantPairsCount += n/2 - i;
            // Move to the next element in the second half
            j++;
        } else {
            // If no, move to the next element in the first half
            i++;
        }
    }
    
    // Return the count of dominant pairs
    return dominantPairsCount;

    }
}
        
