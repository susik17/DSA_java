class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        l1,l2 = len(text1),len(text2)
    # 2D grid
        dp =[[0]*(l2+2) for _ in range(l1+1)]
        for i in range(1,l1+1):
            for j in range(1,l2+1):
                #match => count+1
                if(text1[i-1]==text2[j-1]):
                    dp[i][j] = 1+dp[i-1][j-1]
                #Not match => skip from s1 or s2
                else:
                    dp[i][j] = max(dp[i][j-1],dp[i-1][j])
        return dp[l1][l2]
    
'''
SUBPROBLEM DEFINITION
dp[i][j] = length of LCS of s1[0..i-1] and s2[0..j-1]. If s1[i-1] == s2[j-1]: characters match! dp[i][j] = dp[i-1][j-1] + 1 Else:
take best by skipping one character from either: dp[i][j] = max(dp[i-1][j], dp[i][j-1])


s1="ABCB" s2="BCB" (small example)
Build dp table (rows=s1, cols=s2):
"" B C B
"" 0 0 0 0
A 0 0 0 0 ¬ A¹B,A¹C,A¹B ® take max of top/left
B 0 1 1 1 ¬ B=B: dp=dp[0][0]+1=1; B¹C: max(1,0)=1; B=B: dp[1][2]+1? No, dp[1][2]=1
C 0 1 2 2 ¬ C¹B: max(0,1)=1; C=C: dp[1][1]+1=2; C¹B: max(2,1)=2
B 0 1 2 3 ¬ B=B: dp[2][0]+1=1; B¹C: max(1,2)=2; B=B: dp[3][2]+1=3
Answer = dp[4][3] = 3
(LCS = "BCB"
'''