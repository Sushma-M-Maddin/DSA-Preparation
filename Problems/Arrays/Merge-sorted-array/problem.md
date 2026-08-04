# Merge Sorted Array

## LeetCode

https://leetcode.com/problems/merge-sorted-array/

---

## Pattern

Two Pointers | In-Place Merge

---

## Difficulty

Easy

---

## Problem Statement

You are given two sorted integer arrays:

nums1 of size m + n

nums2 of size n

The first m elements of nums1 are valid elements.

The last n elements are empty spaces reserved for merging.

Merge nums2 into nums1 as one sorted array.

The merge must be done in-place.

---

## Example

Input

nums1 = [1,2,3,0,0,0]

m = 3

nums2 = [2,5,6]

n = 3

Output

[1,2,2,3,5,6]

---

# Intuition

At first, writing from the front seems natural.

But writing from the front overwrites values in nums1 before we compare them.

Example

nums1

1 2 3 _ _ _

Suppose we immediately write another 2.

The original 3 gets overwritten and is lost.

Instead,

write from the back because those positions are empty.

Nothing important gets destroyed.

---

# Thinking Process

Whenever you see this problem ask yourself:

Question 1

Where is the empty space?

Answer

At the end of nums1.

Question 2

Where should I write?

Answer

From the end.

Question 3

What should I compare?

Answer

Compare the last valid element of nums1

with

the last element of nums2.

Question 4

Which value should I write?

Answer

The larger value.

Question 5

Which pointer should move?

Answer

Move the pointer whose value was used.

Always move k because one position has been filled.

---

# Pointer Responsibilities

i

Represents the last valid element in nums1.

Initial value

i = m - 1

---

j

Represents the last element in nums2.

Initial value

j = n - 1

---

k

Represents the last writable position in nums1.

Initial value

k = m + n - 1

---

# Algorithm

1. Initialize three pointers.

i = m - 1

j = n - 1

k = m + n - 1

2. While there are elements remaining in nums2.

3. Compare nums1[i] and nums2[j].

4. Place the larger value at nums1[k].

5. If nums1[i] was used

move i--

Otherwise

move j--

6. Always move k--

7. Continue until nums2 becomes empty.

---

# Dry Run

nums1

1 2 3 _ _ _

nums2

2 5 6

Compare

3 and 6

Write

6

Move

j--

k--

Compare

3 and 5

Write

5

Move

j--

k--

Compare

3 and 2

Write

3

Move

i--

k--

Compare

2 and 2

Write

2

Move

i--

k--

Compare

1 and 2

Write

2

Move

j--

k--

nums2 becomes empty.

Finished.

Result

1 2 2 3 5 6

---

# Time Complexity

O(m + n)

---

# Space Complexity

O(1)

---

# Pattern Learning

Whenever the destination array already contains data

AND

extra space exists at the end,

always think:

"Can I fill from the back instead of the front?"

This is a very common interview trick.