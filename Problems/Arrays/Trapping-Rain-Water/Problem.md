# Trapping Rain Water

## LeetCode

https://leetcode.com/problems/trapping-rain-water/

---

## Pattern

Two Pointers | Optimization

---

## Difficulty

Hard

---

## Problem Statement

You are given an array `height` where each element represents the height of a building.

After raining, water gets trapped between buildings.

Return the total amount of water trapped.

---

## Example

Input

height = [3,0,2,0,4]

Output

7

---

# Intuition

Imagine every array element as a building.

When rain falls,

water is trapped only between taller buildings.

The amount of water trapped at every position depends on

1. Tallest wall on the left.
2. Tallest wall on the right.

The smaller of these two walls determines the water level.

---

# Visualization

Example

Index

0   1   2   3   4

Height

3   0   2   0   4

After Rain

3   3   3   3   4

Water Trapped

0   3   1   3   0

Total

3 + 1 + 3 = 7

---

# Formula

Water Level

=

min(leftMax, rightMax)

Water Trapped

=

Water Level - Current Height

---

# Thinking Process

Question 1

What decides the water level?

Answer

The shorter of the tallest walls.

Because water spills over the smaller wall.

---

Question 2

Can the taller wall alone increase the water level?

Answer

No.

The smaller wall is always the limiting wall.

---

Question 3

Why do we compare leftMax and rightMax?

Answer

Whichever maximum is smaller determines the water level.

So that side can be processed immediately.

---

# Algorithm

1.

Initialize

left = 0

right = height.length - 1

leftMax = height[left]

rightMax = height[right]

totalWater = 0

2.

While(left < right)

3.

Update

leftMax = Math.max(leftMax, height[left])

rightMax = Math.max(rightMax, height[right])

4.

If(leftMax < rightMax)

totalWater += leftMax - height[left]

left++

5.

Else

totalWater += rightMax - height[right]

right--

6.

Return totalWater

---

# Time Complexity

O(n)

---

# Space Complexity

O(1)

---

# Pattern Learning

Instead of searching for the tallest wall for every position,

remember the tallest wall seen so far from both directions.

This avoids repeated work and allows solving the problem in one traversal.