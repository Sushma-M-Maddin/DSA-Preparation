# Remove Duplicates from Sorted Array

## LeetCode

https://leetcode.com/problems/remove-duplicates-from-sorted-array/

---

## Pattern

Two Pointers (Reader & Writer)

---

## Difficulty

Easy

---

## Problem Statement

Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once.

The relative order of the elements should remain the same.

Return the number of unique elements.

The first `k` elements of the array should contain the unique values.

The remaining elements do not matter.

---

## Example

Input:

1 1 2

Output:

2

Modified Array:

1 2 _

---

Input:

0 0 1 1 1 2 2 3 3 4

Output:

5

Modified Array:

0 1 2 3 4 _ _ _ _ _

---

## Intuition

Since the array is already sorted,

all duplicate values are adjacent.

Use:

- Reader pointer → scans every element.
- Writer pointer → stores only unique elements.

---

## Algorithm

1. Initialize:

left = 0

right = 1

2. Traverse the array using `right`.

3. If current value is different,

move `left`

copy the value.

4. Continue until the end.

5. Return `left + 1`.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Pattern Learning

Reader

- Reads every element.
- Always moves.

Writer

- Stores only useful values.
- Moves only when writing.