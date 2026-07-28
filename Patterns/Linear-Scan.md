# Linear Scan Pattern

## 📌 Definition

Linear Scan is one of the simplest and most commonly used DSA patterns.

The idea is to traverse every element of the array exactly once while maintaining one or more variables that store the required information.

---

# 💡 When to Use

Use Linear Scan when:

- You need to find the largest or smallest element.
- You need to count occurrences.
- You need to find the second largest or second smallest element.
- You need to calculate the sum or average.
- You need to validate a condition for every element.

---

# 🧠 Mental Model

```
Start

↓

Visit every element

↓

Update the answer if required

↓

Move to the next element

↓

Finish
```

---

# 🚀 General Algorithm

1. Initialize required variables.
2. Traverse the array once.
3. Update the variables whenever necessary.
4. Return the final answer.

---

# ⏱️ Complexity

### Time Complexity

```
O(n)
```

One complete traversal.

### Space Complexity

```
O(1)
```

Only a few variables are used.

---

# 🎯 Problems Using This Pattern

- Second Largest Element
- Largest Element
- Smallest Element
- Count Even Numbers
- Maximum Consecutive Ones
- Check if Array is Sorted

---

# 🎯 Interview Tips

- Don't sort the array unless required.
- Always think if one traversal is enough.
- Keep only the information you need.

---

# ❌ Common Mistakes

- Sorting unnecessarily.
- Forgetting to update variables.
- Using extra space when not required.

---

# 📝 Mental Framework

Before coding, ask:

1. What information do I need?
2. Which variables will store that information?
3. When should those variables be updated?
4. Can I solve this in one traversal?

---

# 📚 Summary

Linear Scan is the foundation of many array problems.

If the problem only requires visiting each element once, Linear Scan is often the optimal solution.