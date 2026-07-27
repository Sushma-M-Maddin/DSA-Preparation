# Module 1 – Time & Space Complexity

## Why Do We Analyze Algorithms?

When solving a problem, there may be multiple algorithms that produce the same output.

The important question is:

> **Which algorithm performs better as the input size grows?**

Time Complexity and Space Complexity help us compare algorithms independently of hardware, operating system, or programming language.

---

# Time Complexity

## Definition

Time Complexity describes how the amount of work (or number of operations) performed by an algorithm grows as the input size (`n`) increases.

It does **not** measure the execution time in seconds.

---

## Why Not Measure Time in Seconds?

Execution time depends on:

- CPU speed
- RAM
- Operating System
- Compiler optimizations
- Background processes

Since these differ from one machine to another, execution time is unreliable.

Instead, we measure **growth**.

---

# What is `n`?

`n` represents the size of the input.

Examples:

- Array → Number of elements
- String → Number of characters
- Linked List → Number of nodes

---

# Big O Notation

## Definition

Big O Notation describes how the number of operations grows as the input size increases.

Think of Big O as the **growth label** of an algorithm.

---

# Common Time Complexities

## O(1) – Constant Time

The amount of work never changes regardless of input size.

Example:

```java
System.out.println("Hello");
```

---

## O(n) – Linear Time

The work grows proportionally with the input size.

Example:

```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
```

---

## O(log n) – Logarithmic Time

The problem size is reduced by a constant factor (usually half) in every step.

Example:

```java
while(n > 1){
    n = n / 2;
}
```

Common example:

- Binary Search

---

## O(n²) – Quadratic Time

Occurs when one loop runs completely for every iteration of another loop.

Example:

```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.println();
    }
}
```

---

## O(n³) – Cubic Time

Three nested loops.

Example:

```java
for(...)
    for(...)
        for(...)
```

---

# Rules for Simplifying Big O

## Rule 1 – Ignore Constant Multipliers

```
5n
↓

O(n)
```

---

## Rule 2 – Ignore Constant Additions

```
n + 100

↓

O(n)
```

---

## Rule 3 – Keep Only the Dominant Term

```
n² + n

↓

O(n²)
```

```
n³ + n² + n

↓

O(n³)
```

```
log n + n

↓

O(n)
```

---

# Best, Average and Worst Case

## Best Case

Algorithm receives the most favorable input.

Example:

Searching for the first element.

```
O(1)
```

---

## Average Case

Average performance over all possible inputs.

Linear Search:

```
O(n)
```

---

## Worst Case

Algorithm receives the least favorable input.

Example:

Searching for the last element or an element that does not exist.

```
O(n)
```

---

# Space Complexity

## Definition

Space Complexity measures the amount of **extra memory** required by an algorithm as the input size grows.

Input memory is generally **not counted**.

---

# O(1) Space

Uses constant extra memory.

Example:

```java
int sum = 0;

for(int i=0;i<n;i++)
    sum += i;
```

Only two variables are used regardless of `n`.

---

# O(n) Space

Memory grows proportionally with the input.

Example:

```java
int[] arr = new int[n];
```

---

# O(n²) Space

Memory grows as the square of the input.

Example:

```java
int[][] matrix = new int[n][n];
```

---

# Time vs Space

| Code | Time | Space |
|------|------|-------|
| Print one statement | O(1) | O(1) |
| Single loop | O(n) | O(1) |
| Nested loops | O(n²) | O(1) |
| `new int[n]` | O(n) | O(n) |
| `new int[n][n]` | O(n²) | O(n²) |

---

# Growth Order (Best → Worst)

```
O(1)

↓

O(log n)

↓

O(n)

↓

O(n log n)

↓

O(n²)

↓

O(n³)

↓

O(2ⁿ)

↓

O(n!)
```

---

# Interview Tips

Whenever you see an algorithm, ask:

### For Time Complexity

- How many operations are performed?
- Does the work grow with `n`?

### For Space Complexity

- Does the algorithm allocate additional memory as `n` grows?

---

# Mental Framework

When solving complexity questions:

1. Does it depend on `n`?
2. Ignore constants.
3. Keep the fastest-growing term.
4. Separate **Time Complexity** from **Space Complexity**.