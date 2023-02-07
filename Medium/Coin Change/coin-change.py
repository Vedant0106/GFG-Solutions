#User function Template for python3
class Solution:
    def count(self, coins, N, Sum):
        dp = [1] + [0] * Sum
        for i in coins:
            for j in range(i, Sum + 1):
                dp[j] += dp[j - i]
        return dp[-1]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys
sys.setrecursionlimit(10**6)

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        sum,N = list(map(int, input().strip().split()))
        coins = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.count(coins,N,sum))

# } Driver Code Ends