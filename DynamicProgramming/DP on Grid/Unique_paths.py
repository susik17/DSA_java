class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # m=> rows n => col 
        dp = [[1]*(n+1) for _ in range(m+1)]

        #Apply  bottom -up 
        for i in range(1,m):
            for j in range(1,n):
                # 2 ways => left + down
                dp[i][j] = dp[i][j-1] + dp[i-1][j]
        return dp[m-1][n-1]