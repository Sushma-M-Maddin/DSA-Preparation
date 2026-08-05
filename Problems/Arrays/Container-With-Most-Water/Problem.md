# Container With Most Water

## LeetCode

https://leetcode.com/problems/container-with-most-water/

---

## Pattern

Two Pointers | Optimization

---

## Difficulty

Medium

---

## Problem Statement

You are given an integer array `height`.

Each element represents the height of a vertical line.

Choose any two lines such that together with the x-axis they form a container.

Return the maximum amount of water the container can store.

---

## Example

Input

height = [1,8,6,2,5,4,8,3,7]

Output

49

---

# Intuition

Every pair of lines forms a container.

The amount of water stored depends on:

1. Water Height
2. Width

Water Height = Smaller of the two heights.

Width = Distance between the two indices.

Area = Water Height × Width

---

# Visualization

Example

Index

0   1   2   3   4   5   6   7   8

Height

1   8   6   2   5   4   8   3   7

Choose

Left = 8

Right = 7

Water Height

min(8,7)

=

7

Width

8 - 1

=

7

Area

7 × 7

=

49

---

# Thinking Process

Question 1

What limits the water?

Answer

The shorter wall.

Because water spills over the shorter wall.

---

Question 2

Can moving the taller wall increase the water level?

Answer

No.

The shorter wall is still limiting the water.

---

Question 3

Which wall should we move?

Answer

Move the shorter wall.

It is the only wall that can possibly increase the water level.

---

# Algorithm

1. Initialize two pointers.

left = 0

right = height.length - 1

2. Initialize

maxArea = 0

3. While left < right

4. Calculate

currentHeight = min(height[left], height[right])

5. Calculate

width = right - left

6. Calculate

area = currentHeight × width

7. Update

maxArea = max(maxArea, area)

8. If

height[left] < height[right]

move left++

Else

move right--

9. Return maxArea

---

# Time Complexity

O(n)

---

# Space Complexity

O(1)

---

# Pattern Learning

This problem teaches optimization using Two Pointers.

Instead of checking every pair (O(n²)), we intelligently move only the shorter pointer because it is the limiting factor for the water height.