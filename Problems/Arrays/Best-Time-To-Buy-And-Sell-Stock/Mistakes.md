# Best Time to Buy and Sell Stock - Mistakes & Learning Notes

---

# Coding Mistakes

## Mistake 1

I accidentally wrote:

```java
arr[i]
```

instead of

```java
prices[i]
```

Reason:

Always use the correct parameter name throughout the method.

---

## Mistake 2

I declared

```java
int profit
```

inside the `else` block and tried to use it outside.

Reason:

Variables declared inside a block (`{}`) are only accessible inside that block.

Correct approach:

Keep the profit calculation and the maximum profit comparison inside the same `else` block.

---

# Conceptual Doubts

## Doubt 1

I was thinking about pointers like the previous problems.

Correct understanding:

This is **not** a Two Pointers problem.

It is a **Linear Scan** problem.

Only one loop variable moves through the array.

---

## Doubt 2

I was confused about where to start.

Correct understanding:

Initialize

minimumPrice = prices[0]

Then start scanning from index 1 because the first element has already been considered.

---

## Doubt 3

I asked:

"What should I compare 7 with?"

Correct understanding:

We do **not** compare the first price with another element.

We simply assume:

minimumPrice = prices[0]

From the second element onward:

Compare today's price with minimumPrice.

---

## Doubt 4

Why do we remember only the minimum price?

Correct understanding:

The minimum price seen so far is always the best buying opportunity.

There is no need to remember every previous price.

---

## Doubt 5

I confused prices with profit.

Correct understanding:

prices[i]

Today's selling price.

minimumPrice

Best buying price.

profit

Today's selling price - Best buying price.

maximumProfit

Best profit found so far.

---

## Doubt 6

Why is there an else block?

Correct understanding:

If today's price becomes the new minimum price, we update it.

There is no benefit in calculating profit for the same day because:

profit = minimumPrice - minimumPrice = 0

Instead, we continue to future days.

---

# Interview Lessons

✔ Identify the pattern before coding.

✔ Linear Scan uses one traversal.

✔ Keep only useful information while scanning.

✔ Minimum Price represents the best buying opportunity.

✔ Maximum Profit represents the best answer found so far.

✔ Compare profits, not prices.

✔ Separate:

- Buying Price
- Selling Price
- Profit

while solving the problem.