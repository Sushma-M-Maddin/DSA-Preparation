# Best Time to Buy and Sell Stock

## LeetCode

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

---

## Pattern

Linear Scan

---

## Difficulty

Easy

---

## Problem Statement

You are given an array where `prices[i]` represents the stock price on the `i-th` day.

You want to maximize your profit by choosing:

- One day to buy
- One later day to sell

Return the maximum profit you can achieve.

If no profit is possible, return `0`.

---

## Example 1

Input

prices = [7,1,5,3,6,4]

Output

5

Explanation

Buy at 1

Sell at 6

Profit = 5

---

## Example 2

Input

prices = [7,6,4,3,1]

Output

0

Explanation

Prices keep decreasing, so no profit is possible.

---

## Intuition

We only need to walk through the array once.

While scanning:

- Remember the minimum price seen so far.
- Calculate the profit if we sell today.
- Update the maximum profit whenever we find a better one.

---

## Algorithm

1. Initialize

minimumPrice = prices[0]

maximumProfit = 0

2. Traverse the array from index 1 to the end.

3. If today's price is smaller than minimumPrice

Update minimumPrice.

4. Otherwise

Calculate

profit = prices[i] - minimumPrice

5. If profit is greater than maximumProfit

Update maximumProfit.

6. Return maximumProfit.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Pattern Learning

Linear Scan means we move through the array only once.

Instead of comparing every possible buy-sell pair, we remember useful information while traversing.

Information remembered:

- Minimum Price So Far
- Maximum Profit So Far