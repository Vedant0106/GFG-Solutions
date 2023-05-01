//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends

class Solution {
    boolean good(int x, int[] nums, int k) {
        long s = 0, cnt = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            s += nums[i];
            if(s >= x) {
                s = 0;
                cnt++;
            }
        }
        return cnt >= k + 1;
    }

    int maxSweetness(int[] sweetness, int N, int K) {
        int s = 0, e = 1000000000, ans = 0;
        while(s <= e) {
            int m = (s + e) / 2;
            if(good(m, sweetness, K)) {
                s = m + 1;
                ans = m;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}