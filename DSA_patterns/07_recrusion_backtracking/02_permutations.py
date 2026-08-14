'''
Permutation:
backtrack() → every element, but used[] prevents reuse => order matters

Combination Sum:
backtrack(i) → start from same i, so reuse is allowed => order doesnot matters
'''

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:

        res,path =[],[]
        used =[False]*len(nums)
        def backtrack():
            #base case
            if len(nums) == len(path):
                res.append(list(path))
                return

            for i in range(len(nums)):
                #skip for used 
                if used[i]:
                   continue
                #choose
                used[i] = True 
                path.append(nums[i])
                #explore
                backtrack()
                #undo 
                path.pop()
                used[i] = False 
                

        backtrack()
        return res
        