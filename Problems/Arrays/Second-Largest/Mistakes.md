# Mistakes - Second Largest Element

## ❌ Mistake 1

### Mistake

Initially, I thought sorting the array would be the easiest way to find the second largest element.

### Why it's not optimal

Sorting takes:

```
O(n log n)
```

The problem can be solved in a single traversal.

### Correct Approach

Maintain two variables:

- largest
- secondLargest

Update them while traversing the array once.

---

## 💡 What I Learned

- Always think about whether sorting is really required.
- If only the largest or second largest value is needed, a single traversal is usually enough.
- Before coding, think about the most efficient approach.

---

## 📝 Interview Reminder

If the interviewer asks:

> "Can you optimize it?"

The expected answer is:

- Time Complexity → **O(n)**
- Space Complexity → **O(1)**
- Pattern → **Linear Scan**