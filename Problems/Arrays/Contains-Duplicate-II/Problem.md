# Contains Duplicate II

## LeetCode

https://leetcode.com/problems/contains-duplicate-ii/

---

## Pattern

Sliding Window + HashSet

---

## Difficulty

Easy

---

## Problem Statement

Given an integer array `nums` and an integer `k`, return true if there are two distinct indices `i` and `j` such that:

|i - j| ≤ k  
and  
nums[i] == nums[j]

---

## Example 1

Input

nums = [1,2,3,1]  
k = 3  

Output

true

---

## Example 2

Input

nums = [1,2,3,1,2,3]  
k = 2  

Output

false

---

# Intuition

We need to check if a duplicate exists **within distance k**.

Instead of checking the whole array,  
we only care about the **last k elements**.

---

# Key Idea

Maintain a sliding window of size `k` using a HashSet.

At each step:

1. Check if element already exists → duplicate found
2. Add current element
3. Remove element that goes out of window

---

# Algorithm

1. Create a HashSet
2. Loop through array
3. If set contains current element → return true
4. Add current element to set
5. If set size > k → remove nums[i - k]
6. Return false

---

# Time Complexity

O(n)

---

# Space Complexity

O(k)

---

# Pattern Learning

This problem combines:

- Sliding Window → to maintain range k  
- HashSet → for O(1) duplicate check  

---

# Important Note

We must remove elements outside the window, otherwise we will incorrectly detect duplicates beyond distance k.