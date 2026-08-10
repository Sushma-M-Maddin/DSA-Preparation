# Maximum Average Subarray I

## LeetCode

https://leetcode.com/problems/maximum-average-subarray-i/

---

## Pattern

Sliding Window (Fixed Size)

---

## Difficulty

Easy

---

## Problem Statement

Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` that has the maximum average value and return this value.

---

## Example

Input

nums = [1,12,-5,-6,50,3]  
k = 4  

Output

12.75

---

## Explanation

Subarrays of size 4:

[1,12,-5,-6] → sum = 2 → avg = 0.5  
[12,-5,-6,50] → sum = 51 → avg = 12.75  
[-5,-6,50,3] → sum = 42 → avg = 10.5  

Maximum average = 12.75

---

# Intuition

We need to find a subarray of size `k` with maximum average.

Instead of calculating average every time:

👉 Focus on **maximum sum**

Because:

average = sum / k

Since `k` is constant:

👉 Maximizing sum automatically maximizes average.

---

# Sliding Window Idea

1. Calculate sum of first window of size `k`
2. Slide the window:
   - Remove left element
   - Add new right element
3. Track maximum sum
4. Return maxSum / k

---

# Formula

New Window Sum

=

Previous Sum - outgoing element + incoming element

---

# Algorithm

1. Initialize windowSum = 0
2. Compute first window sum
3. Set maxSum = windowSum
4. Loop from i = k to n:
   - windowSum = windowSum - nums[i-k] + nums[i]
   - maxSum = max(maxSum, windowSum)
5. Return maxSum / k

---

# Time Complexity

O(n)

---

# Space Complexity

O(1)

---

# Pattern Learning

Fixed window size problems can be optimized using sliding window by reusing the previous computation instead of recalculating everything.