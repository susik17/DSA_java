class Solution:
    def knapsack(self, W, val, wt):
        # code here
        
        n = len(wt)
        
        dp = [[0]*(W+1) for _ in range(n+1)]
        for i in range(1,n+1):
            for w in range(W+1):
                #option1 : skip item i
                #f(3,2) => f(2,2)
                skip = dp[i-1][w]
                take = 0
                
                ## Option 2: take item i (if it fits)
                #check with current weight wnot full capacity W
                if(wt[i-1] <= w):
                    
                    take = val[i-1]+dp[i-1][w-wt[i-1]]
                dp[i][w] = max(skip,take)
                    
        return dp[n][W]
        
'''
dp[i][w] =>
maximum value possible
using first i items
with capacity w

#indx=>[0,1,2,3]
#wt => [2,3,4,5]
#val=> [3,4,5,6]
#capacity => 5

op:7

#dp => 
initial =>
        capacity
        0 1 2 3 4 5

item0  0 0 0 0 0 0
item1  0 0 0 0 0 0
item2  0 0 0 0 0 0
item3  0 0 0 0 0 0
item4  0 0 0 0 0 0

Formula:
skip => dp[i−1][w]
take => dp[i−1][w−weight]
dp[i][w]=max(dp[i−1][w],value+dp[i−1][w−weight])

final =>
        0 1 2 3 4 5

row0    0 0 0 0 0 0
row1    0 0 3 3 3 3
row2    0 0 3 4 4 7
row3    0 0 3 4 5 7
row4    0 0 3 4 5 7
'''