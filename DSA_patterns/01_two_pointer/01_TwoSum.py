#bruteforce => check every possible pair => 

def two_sum_brute(arr, target):
    n = len(arr)

    for i in range(n):
        for j in range(i + 1, n):
            if arr[i] + arr[j] == target:
                return [i, j]

    return []

# optimal 1 => Sorted Array => Two Pointers

def two_sum_sorted(arr, target):
    left = 0
    right = len(arr) - 1

    while left < right:
        total = arr[left] + arr[right]

        if total == target:
            return [left, right]

        elif total < target:
            left += 1

        else:
            right -= 1

    return []

#optimal => both sorted & unsorted
def two_sum_hashmap(arr, target):
    seen = {}

    for i in range(len(arr)):
        need = target - arr[i]

        if need in seen:
            return [seen[need], i]

        seen[arr[i]] = i

    return []

'''
Two Sum – Interview Notes
1. Brute Force (Works for Both Sorted & Unsorted)

Logic:

Check every possible pair.
If arr[i] + arr[j] == target, return the indices.

Time: O(n²)
Space: O(1)

2. Sorted Array → Two Pointers (Optimal)

Logic:

left = 0, right = n - 1
Calculate sum = arr[left] + arr[right]
sum == target → Return indices
sum < target → left++
sum > target → right--

Time: O(n)
Space: O(1)

3. Unsorted Array → HashMap (Optimal)

Logic:

Traverse the array once.
need = target - current
If need exists in the hashmap → Return indices.
Otherwise, store {current : index}.

Time: O(n)
Space: O(n)

Quick Revision
Array	Best Approach	Time	Space
Sorted	Two Pointers	O(n)	O(1)
Unsorted	HashMap	O(n)	O(n)
Any Array	Brute Force	O(n²)	O(1)

'''