# Rotate Array

## LeetCode

https://leetcode.com/problems/rotate-array/

---

## Pattern

Array Manipulation | Reverse Technique | Two Pointers

---

## Difficulty

Medium

---

## Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

The rotation must be performed **in-place**, meaning no extra array should be used.

---

## Example 1

Input

nums = [1,2,3,4,5,6,7]

k = 3

Output

[5,6,7,1,2,3,4]

---

## Example 2

Input

nums = [-1,-100,3,99]

k = 2

Output

[3,99,-1,-100]

---

## Intuition

Instead of shifting the array one position at a time, we can use the reverse technique.

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining elements.

This restores the order of both parts while placing them in the correct positions.

---

## Algorithm

1. Calculate `k = k % n`.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining elements.
5. The array is now rotated to the right by `k` positions.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Pattern Learning

This problem teaches the Reverse Technique.

Instead of repeatedly shifting elements, we perform three reversals to achieve the rotation in linear time.

The same reverse helper method can be reused for different sections of the array.