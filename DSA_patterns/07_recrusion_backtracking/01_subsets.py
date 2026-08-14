# Brute force - bitmask
def subsets_bitmask(nums):
    n = len(nums)
    res = []
    for mask in range(1 << n):
        subset = [nums[i] for i in range(n) if mask & (1 << i)]
        res.append(subset)
    return res
# Optimal - Backtracking
def subsets_backtrack(nums):
    res, path = [], []
    def backtrack(start):
        res.append(path[:]) #res.append(list(path)) => to avoid same refernce changing 
        for i in range(start, len(nums)):
            #choose
            path.append(nums[i])
            #Explore
            backtrack(i + 1)
            #undo
            path.pop()
    backtrack(0)
    return res