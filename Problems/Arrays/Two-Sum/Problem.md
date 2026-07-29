# Two Sum II - Input Array Is Sorted

## LeetCode

https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

---

## Pattern

Two Pointers

---

## Difficulty

Medium

---

## Problem Statement

Given a **1-indexed** array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

Return the indices (1-based) of the two numbers.

You may assume that there is exactly one solution.

You may not use the same element twice.

---

## Example

Input

numbers = [2,7,11,15]

target = 9

Output

[1,2]

Explanation

2 + 7 = 9

---

## Intuition

Since the array is already sorted,

we can use two pointers.

- Left pointer starts from the beginning.
- Right pointer starts from the end.

If the current sum is:

- Greater than target → move the right pointer.
- Smaller than target → move the left pointer.
- Equal to target → return the answer.

---

## Algorithm

1. Initialize

left = 0

right = numbers.length - 1

2. While left < right

3. Calculate

sum = numbers[left] + numbers[right]

4. If sum == target

return new int[]{left + 1, right + 1}

5. Else if sum > target

right--

6. Else

left++

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Pattern Learning

Sorted array gives us direction.

- Move Left → Increase the sum.
- Move Right → Decrease the sum.

Only one pointer moves in each iteration.