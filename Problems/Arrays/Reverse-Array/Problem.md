# Reverse Array

## 📌 Problem Statement

Given an integer array, reverse the array in-place without using any extra array.

### Example

Input:

```text
[1, 2, 3, 4, 5]
```

Output:

```text
[5, 4, 3, 2, 1]
```

---

## 💡 Intuition

Instead of creating another array, swap the first and last elements, then move inward until both pointers meet.

---

## 🚀 Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = arr.length - 1`
2. Swap the elements at `left` and `right`.
3. Move:
   - `left++`
   - `right--`
4. Repeat until `left < right`.

---

## ⏱️ Complexity

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## 📝 Dry Run

Input

```text
[1, 2, 3, 4, 5]
```

```
Swap 1 and 5
↓

[5,2,3,4,1]

Swap 2 and 4
↓

[5,4,3,2,1]

Stop when left == right
```

---

## 🎯 Interview Tips

- No extra array required.
- Two Pointer is the optimal approach.
- Stop when pointers meet.

---

## 📚 Pattern Used

**Two Pointers (Meet in Middle)**