# Interval + Heap Pattern Notes

# What is Interval Problem?

Whenever you see:

- start time
- end time
- overlap
- meeting rooms
- scheduling
- cooldown
- resource allocation

mostly it is Interval Pattern.

Example:

```python
(0,30)
(5,10)
(15,20)
```

Here:

- first meeting runs from 0 to 30
- second from 5 to 10

Both overlap.

So same room cannot be used.

---

# Core Idea

Main question:

```text
Which room/resource becomes free earliest?
```

That is the whole logic.

Resource can be:

- meeting room
- machine
- server
- worker
- CPU
- task slot

---

# Why Heap?

Heap is used when we continuously need:

- smallest value
OR
- largest value

quickly.

In interval problems we need:

```text
earliest ending room
```

So we use MIN HEAP.

---

# What is Heap?

Heap is a special data structure.

Python gives MIN HEAP by default.

```python
import heapq
```

---

# Important Heap Operations

## Push

```python
heapq.heappush(heap, value)
```

Adds value.

---

## Pop Smallest

```python
heapq.heappop(heap)
```

Removes smallest value.

---

# Important Point

Heap is NOT fully sorted.

Only guarantee:

```text
smallest element always at front
```

So:

```python
heap[0]
```

gives smallest value directly.

---

# Why Not Use Sorting Only?

Sorting works only once.

But interval problems are dynamic.

Meetings continuously:

- added
- removed
- reused

Example:

```python
[30,10]
```

Need earliest room.

Without heap:

```python
min([30,10])
```

Every time searching is slow.

Heap gives:

```python
heap[0]
```

directly.

---

# Difference

## Sorting

```text
One-time arrangement
```

## Heap

```text
Dynamic smallest tracking
```

---

# Meeting Rooms II Problem => Min Rooms Needed

## Problem Statement

Given meeting intervals:

```python
[(0,30),(5,10),(15,20)]
```

Find minimum rooms needed.

---

# Example

```python
Input:
[(0,30),(5,10),(15,20)]

Output:
2
```

Explanation:

- `(0,30)` overlaps with `(5,10)`
- Need second room
- `(15,20)` can reuse room from `(5,10)`

---

# Core Logic

## Step 1 — Sort by Start Time

```python
intervals.sort(key=lambda x:x[0])
```

Why?

Because meetings must be processed in timeline order.

---

## Step 2 — Heap Stores End Times

```python
heap = []
```

Heap stores:

```text
current active meeting end times
```

---

## Step 3 — Process Every Meeting

For every:

```python
(start,end)
```

Check:

```python
heap[0]
```

Earliest free room.

---

# Reuse Room

```python
if heap and heap[0] <= start:
```

Meaning:

- heap is not empty
- earliest room became free before current meeting starts

So room can be reused.

---

# Why Check `heap`?

```python
if heap and heap[0] <= start:
```

because:

```python
heap[0]
```

on empty heap gives error.

Example:

```python
heap = []
heap[0]
```

Error:

```text
IndexError
```

So first check heap exists.

---

# Full Code

```python
import heapq

class Solution:

    def minMeetingRooms(self, intervals):

        # sort by start time
        intervals.sort(key=lambda x:x[0])

        # min heap
        heap = []

        for start,end in intervals:

            # reuse room
            # if heap empty => heap[0] -> indexoutofError
            if heap and heap[0] <= start:
                heapq.heappop(heap)

            # occupy room till end
            heapq.heappush(heap,end)

        return len(heap)


obj = Solution()

print(obj.minMeetingRooms([(0,30),(5,10),(15,20)]))
```

---

# Dry Run

Meetings:

```python
[(0,30),(5,10),(15,20)]
```

---

## Process (0,30)

Heap empty.

Push 30.

```python
heap = [30]
```

---

## Process (5,10)

Check:

```python
30 <= 5
```

False.

Need new room.

Push 10.

```python
heap = [10,30]
```

---

## Process (15,20)

Check:

```python
10 <= 15
```

True.

Reuse room.

Pop 10.

Push 20.

```python
heap = [20,30]
```

Final rooms:

```python
2
```

---

# Time Complexity

Sorting:

```text
O(n log n)
```

Heap operations:

```text
O(log n)
```

Overall:

```text
O(n log n)
```

---

# Real World Uses

Heap + Interval pattern used in:

- Meeting room scheduling
- CPU scheduling
- Kubernetes job scheduling
- CI/CD runners
- Server allocation
- Resource management
- Load balancing

---

# Easy Memory Trick

```text
Sort by START time
Heap tracks END times

If earliest END <= current START:
    reuse room
Else:
    need new room
```
