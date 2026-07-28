# Palindrome

## 📌 Problem Statement

Given an integer array, determine whether it is a palindrome.

### Example

Input

```text
[1,2,3,2,1]
```

Output

```text
true
```

---

## 💡 Intuition

Compare the first and last elements.

If they match, move inward.

If any pair does not match, return false immediately.

---

## 🚀 Approach

1. Initialize two pointers.
2. Compare both ends.
3. If mismatch → return false.
4. Move inward.
5. Return true after loop completes.

---

## ⏱️ Complexity

Time

```
O(n)
```

Space

```
O(1)
```

---

## 📝 Dry Run

```
1 2 3 2 1

1 == 1

↓

2 == 2

↓

3

↓

Palindrome
```

---

## 🎯 Interview Tips

- Return false immediately on mismatch.
- Don't compare every element.

---

## 📚 Pattern Used

**Two Pointers**