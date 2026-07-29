# Two Sum II - Mistakes & Learning Notes

---

# Coding Mistakes

## Mistake 1

I wrote:

```java
return [left + 1, right + 1];
```

### Why it is wrong

Java cannot return an array using square brackets.

Correct:

```java
return new int[]{left + 1, right + 1};
```

---

## Mistake 2

Forgot to return an array after the while loop.

Correct:

```java
return new int[]{};
```

Reason:

Every execution path of a method returning `int[]` must return an array.

---

# Conceptual Doubts

## Doubt 1

Why does the sorted array matter?

Initially I thought:

The required numbers would be adjacent.

Correct understanding:

The numbers are not necessarily adjacent.

The sorted order tells us which pointer to move.

Without sorting, we would not know how to reduce or increase the sum.

---

## Doubt 2

Why do we move only one pointer?

Initially I thought both pointers should move together.

Correct understanding:

Only one pointer moves because we only need to adjust the current sum.

If:

sum > target

move right--

If:

sum < target

move left++

Moving both pointers may skip the correct answer.

---

## Doubt 3

Why do we move right when the sum is greater?

Because moving the right pointer left gives a smaller value.

Smaller value

↓

Smaller sum.

---

## Doubt 4

Why do we move left when the sum is smaller?

Because moving the left pointer right gives a larger value.

Larger value

↓

Larger sum.

---

## Doubt 5

I confused values with indices.

Example

Array

Index

0 1 2 3

Value

2 7 11 15

The problem asks for

1-based indices

not the values.

---

## Doubt 6

I forgot that pointers keep their updated positions.

Example

right becomes 5.

Later,

only left moves.

right still remains 5.

Pointers are not reset every iteration.

---

## Doubt 7

I wrote

left--

instead of

left++.

Correct understanding

If the sum is too small,

we need a larger value.

Therefore,

move left forward.

---

# Interview Lessons

✔ Always identify whether the array is sorted.

✔ Sorted array gives direction.

✔ Left pointer increases the sum.

✔ Right pointer decreases the sum.

✔ Never move both pointers together.

✔ Think about changing the sum, not changing the pointers.

✔ Separate:

- Index
- Value
- 1-based Position

before returning the answer.