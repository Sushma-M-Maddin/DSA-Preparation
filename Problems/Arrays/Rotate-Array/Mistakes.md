# Rotate Array - Mistakes & Learning Notes

---

# Coding Mistakes

## Mistake 1

I reset the values of `left` and `right` inside the `reverse()` method.

```java
left = 0;
right = nums.length - 1;
```

### Why it is wrong

The `reverse()` method should work for **any portion** of the array.

The caller decides which part to reverse.

Correct usage:

```java
reverse(nums, 0, n - 1);
reverse(nums, 0, k - 1);
reverse(nums, k, n - 1);
```

---

## Mistake 2

Forgot to move the pointers after swapping.

Incorrect:

```java
while(left < right){

    swap...

}
```

Correct:

```java
left++;
right--;
```

Without moving the pointers, the loop never progresses.

---

## Mistake 3

Returned the array from a `void` method.

Incorrect:

```java
return nums;
```

Correct:

The array is modified in place, so no return statement is required.

---

## Mistake 4

Initially thought `k` represented an index.

Correct understanding:

`k` represents the **number of right rotations**, not a split position.

---

## Mistake 5

Forgot to handle cases where `k > nums.length`.

Correct approach:

```java
k = k % nums.length;
```

---

# Conceptual Learning

## Why do we reverse three times?

Reverse the whole array.

Reverse the first `k` elements.

Reverse the remaining elements.

This restores the correct order while placing each section in its final position.

---

## Why use a helper method?

The same reverse logic is reused three times.

This avoids duplicate code and makes the solution easier to maintain.

---

## Why do we calculate `k % n`?

If the array length is 5:

Rotating 5 times returns the array to its original state.

Rotating 8 times is the same as rotating 3 times.

Example:

```java
8 % 5 = 3
```

---

# Interview Lessons

✔ Identify the pattern before coding.

✔ Avoid repeated shifting when a better approach exists.

✔ Reuse helper methods instead of duplicating logic.

✔ Always think about edge cases (`k > n`).

✔ Reverse Technique is a common interview pattern.