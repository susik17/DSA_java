
class Solution:
    def maxSubarraySum(self, arr, k):
        
        # 1. Brute Force
        max_sum = float('-inf')
        for i in range(len(arr) - k + 1):
            curr_sum = 0
            for j in range(i, i + k):
                curr_sum += arr[j]
            max_sum = max(max_sum, curr_sum)
        return max_sum


        # 2. Using sum()
        max_sum = float('-inf')
        for i in range(len(arr) - k + 1):
            curr_sum = sum(arr[i:i + k])
            max_sum = max(max_sum, curr_sum)
        return max_sum


        # 3. Sliding Window - Optimal
        window_sum = sum(arr[:k])
        best = window_sum

        for i in range(k, len(arr)):
            window_sum += arr[i] - arr[i - k]
            best = max(best, window_sum)

        return best
#ip
#[100,200,300,400] k=2
#ans : 700
'''
# Maximum Subarray Sum of Size K

### Question

Given an array `arr` and an integer `k`, find the **maximum sum of any contiguous subarray of size `k`**.

Example:

```text
arr = [2, 1, 5, 1, 3, 2]
k = 3

Windows:
[2, 1, 5] → 8
[1, 5, 1] → 7
[5, 1, 3] → 9
[1, 3, 2] → 6

Answer = 9
```

---

### 1. Brute Force

**Every window → calculate sum → update maximum**

```python
max_sum = float('-inf')

for i in range(len(arr) - k + 1):
    curr_sum = 0

    for j in range(i, i + k):
        curr_sum += arr[j]

    max_sum = max(max_sum, curr_sum)

return max_sum
```

**TC:** O(n × k)
**SC:** O(1)

---

### 2. Using `sum()` — Simple Variant

**Every window → `sum(arr[i:i+k])` → update maximum**

```python
max_sum = float('-inf')

for i in range(len(arr) - k + 1):
    curr_sum = sum(arr[i:i+k])
    max_sum = max(max_sum, curr_sum)

return max_sum
```

**TC:** O(n × k)
**SC:** O(k) — slicing

---

### 3. Sliding Window ⭐ Optimal

**First window sum → remove left → add right → update maximum**

```python
window_sum = sum(arr[:k])
best = window_sum

for i in range(k, len(arr)):
    window_sum += arr[i] - arr[i-k]
    best = max(best, window_sum)

return best
```

**TC:** O(n)
**SC:** O(1)

### Pattern

**Fixed-size subarray → Sliding Window**

'''
