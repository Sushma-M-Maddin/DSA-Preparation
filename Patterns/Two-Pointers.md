# Two Pointer Pattern

## 📌 Definition

The Two Pointer pattern uses two indexes to traverse an array efficiently.

Instead of using nested loops, two pointers work together to solve the problem in a single traversal.

---

# 💡 When to Use

Use Two Pointers when:

- Comparing elements from both ends.
- Reversing an array.
- Checking for palindrome.
- Rearranging elements.
- Working with sorted arrays.
- Reducing nested loops.

---

# 🧠 Types of Two Pointers

## 1. Meet in the Middle

Pointers start from opposite ends.

```
left → → ← ← right
```

Used for:

- Reverse Array
- Palindrome
- Container With Most Water

---

## 2. Reader & Writer

Pointers have different responsibilities.

```
left

right → → → → →
```

- left → write position
- right → scanning pointer

Used for:

- Move Zeroes
- Remove Duplicates
- Remove Elements

---

# 🚀 General Algorithm

### Meet in the Middle

1. Initialize

```
left = 0
right = arr.length - 1
```

2. Perform the required operation.

3. Move

```
left++
right--
```

4. Stop when pointers meet.

---

### Reader & Writer

1. Initialize

```
left = 0
right = 0
```

2. Scan using `right`.

3. Update or swap using `left`.

4. Move pointers based on the problem.

---

# ⏱️ Complexity

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

# 🎯 Problems Using This Pattern

### Meet in the Middle

- Reverse Array
- Palindrome
- Container With Most Water

### Reader & Writer

- Move Zeroes
- Remove Duplicates from Sorted Array
- Remove Elements

---

# 🎯 Interview Tips

- Clearly define the job of each pointer.
- Don't memorize the code.
- Understand when each pointer should move.
- Decide the stopping condition before writing the loop.

---

# ❌ Common Mistakes

- Mixing pointer responsibilities.
- Using values instead of indexes.
- Forgetting pointer movement.
- Choosing the wrong loop condition.
- Incorrect swapping logic.

---

# 📝 Mental Framework

Before coding, ask:

1. How many pointers do I need?
2. What is the job of each pointer?
3. When does each pointer move?
4. When should the algorithm stop?

---

# 📚 Summary

Two Pointer is one of the most important DSA patterns.

Instead of checking every possible pair using nested loops, two pointers reduce the complexity to a single traversal, making many problems run in **O(n)** time with **O(1)** extra space.