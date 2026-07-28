# Move Zeroes

## 📌 Problem Statement

Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.

### Example

Input

```text
[0,1,0,3,12]
```

Output

```text
[1,3,12,0,0]
```

---

## 💡 Intuition

Use two pointers with different responsibilities.

- left → next position for a non-zero.
- right → scans every element.

---

## 🚀 Approach

1. Initialize left and right.
2. If current element is zero:
   - Move right.
3. Otherwise:
   - Swap left and right.
   - Move both pointers.
4. Continue until right reaches the end.

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
0 1 0 3 12

↓

1 0 0 3 12

↓

1 3 0 0 12

↓

1 3 12 0 0
```

---

## 🎯 Interview Tips

- Don't use an extra array.
- Maintain the order of non-zero elements.
- Understand the different jobs of the two pointers.

---

## 📚 Pattern Used

**Two Pointers (Reader & Writer)**