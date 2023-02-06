//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution 
{
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        // code here
         Set<ArrayList<Integer>> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n-3;i++){
            for(int j =i+1;j<n-2;j++){
                int t = target-nums[i]-nums[j];
                int k = j+1;
                int l = n-1;
                while(k<l){
                int val=  nums[k]+nums[l];
                if(val<t)k++;
                else if(val>t)l--;
                else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    set.add(temp);
                    k++;
                }
            }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new  ArrayList<ArrayList<Integer>>(set);
        return ans;   
    }
}