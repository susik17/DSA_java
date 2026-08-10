# mY try => o(n) tc O(N) SC
import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = re.sub(r'[^a-zA-Z0-9]','',s)
        s1 = s1.lower()
        s2 = s1[::-1]
        if s1==s2:
            return True
        else:
            return False
#optimal => twopointer => SC O(N)->O(1)
class Solution:
    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1

        while left < right:

            # Skip non-alphanumeric characters
            while left < right and not s[left].isalnum():
                left += 1

            while left < right and not s[right].isalnum():
                right -= 1

            # Compare lowercase characters
            if s[left].lower() != s[right].lower():
                return False

            left += 1
            right -= 1

        return True

'''
Notes:
### 125. Valid Palindrome

**Approach 1 — Simple**

`Remove non-alphanumeric → lowercase → reverse → compare`

```python
s = re.sub(r'[^a-zA-Z0-9]', '', s).lower()
return s == s[::-1]
```

**TC:** O(n) | **SC:** O(n)

---

**Approach 2 — Optimal 

`Left + Right → skip non-alphanumeric → lowercase compare → move inward`

```python
left, right = 0, len(s) - 1

while left < right:
    while left < right and not s[left].isalnum():
        left += 1
    while left < right and not s[right].isalnum():
        right -= 1

    if s[left].lower() != s[right].lower():
        return False

    left += 1
    right -= 1

return True
```

**TC:** O(n) | **SC:** O(1)

**Pattern:** `Palindrome → Two Pointers → Compare from both ends`


'''