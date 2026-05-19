class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        
        dp = [float('inf')] * (amount+1)
        dp[0] = 0
        for i in range(1,amount+1):
            for coin in coins:
                if(i >= coin ):
                    dp[i] = min(dp[i],1+dp[i-coin])
        return dp[amount]  if dp[amount]!=float('inf') else -1


# Example usage:solution = Solution()
coins = [1, 2, 5]                   
amount = 11
solution = Solution()
print(solution.coinChange(coins, amount))   #Output: 3 (11 can be made with 5 + 5 + 1)      