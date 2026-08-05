# Trapping Rain Water - Mistakes & Learning Notes

---

# Coding Mistakes

## Mistake 1

Forgot to declare the water variable.

Incorrect

```java
water = leftMax - height[left];
```

Correct

```java
int water = leftMax - height[left];
```

or directly

```java
totalWater += leftMax - height[left];
```

---

## Mistake 2

Forgot to wrap the logic inside

```java
public int trap(int[] height)
```

---

# Conceptual Doubts

## Doubt 1

Initially confused between

Current Height

and

Water Level.

Correct Understanding

Current Height

=

height[i]

Water Level

=

min(leftMax, rightMax)

Water Trapped

=

Water Level - Current Height

---

## Doubt 2

Initially updated

leftMax = height[left]

Correct

leftMax = Math.max(leftMax, height[left])

Reason

Never lose the tallest wall seen so far.

---

## Doubt 3

Initially thought

Water = leftMax

Correct

Water

=

leftMax - currentHeight

The building already occupies some height.

Only the remaining space stores water.

---

## Doubt 4

Confused between

Container With Most Water

and

Trapping Rain Water.

Difference

Container

Current Left

Current Right

↓

Move Smaller Height

Rain Water

Maximum Left

Maximum Right

↓

Process Smaller Maximum

---

## Doubt 5

Question

Why update leftMax first?

Answer

If the current building is taller,

it becomes the new maximum.

Otherwise,

water could become negative.

---

# Interview Lessons

✔ Think of buildings, not numbers.

✔ Water depends on tallest walls.

✔ Water level is controlled by the smaller maximum.

✔ Remember maximums instead of searching repeatedly.

✔ Update maximum first.

✔ Then calculate water.

---

# Personal Learning Note

The biggest breakthrough was realizing that the water level is determined by the smaller of the two tallest walls, not by the current building.

Once this concept became clear,

the algorithm became very natural.