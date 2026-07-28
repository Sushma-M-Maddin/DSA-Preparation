# Second Largest Element

## 📌 Problem Statement

Given an integer array, find the second largest distinct element in the array.

### Example

Input:

```text
[12, 35, 1, 10, 34, 1]
```

Output:

```text
34
```

---

## 💡 Intuition

Instead of sorting the array, we can find the answer in a single traversal.

Maintain two variables:

- `largest`
- `secondLargest`

As we iterate through the array, update these variables whenever a larger element is found.

---

## 🚀 Approach

1. Initialize `largest` and `secondLargest`.
2. Traverse the array once.
3. If the current element is greater than `largest`:
   - Move `largest` to `secondLargest`.
   - Update `largest`.
4. Otherwise, if the current element is greater than `secondLargest` and not equal to `largest`:
   - Update `secondLargest`.
5. Return `secondLargest`.

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
[12, 35, 1, 10, 34]
```

Initial

```text
largest = -∞
secondLargest = -∞
```

Process

```text
12 → largest = 12

35 → secondLargest = 12
     largest = 35

1 → Ignore

10 → Ignore

34 → secondLargest = 34
```

Answer

```text
34
```

---

## 🎯 Interview Tips

- Don't sort the array just to find the second largest element.
- A single traversal is more efficient.
- Handle duplicate values carefully.
- Clarify whether the problem asks for the second largest **distinct** element.

---

## 📚 Pattern Used

**Linear Scan**