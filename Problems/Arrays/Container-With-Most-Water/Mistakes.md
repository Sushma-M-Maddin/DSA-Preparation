# Container With Most Water - Mistakes & Learning Notes

---

# Coding Mistakes

## Mistake 1

Created a variable with the same name as the array.

Incorrect

```java
int height = Math.min(height[left], height[right]);
```

Correct

```java
int currentHeight = Math.min(height[left], height[right]);
```

Reason

The method parameter is already named `height`.

---

## Mistake 2

Forgot to declare the area variable.

Incorrect

```java
area = currentHeight * width;
```

Correct

```java
int area = currentHeight * width;
```

---

## Mistake 3

Forgot the semicolon after the return statement.

Incorrect

```java
return maxArea
```

Correct

```java
return maxArea;
```

---

# Conceptual Doubts

## Doubt 1

Initially confused between height and width.

Correct understanding

Height comes from values.

```text
min(height[left], height[right])
```

Width comes from indices.

```text
right - left
```

Never calculate width using the values.

---

## Doubt 2

Initially thought moving the taller wall could increase the answer.

Correct understanding

The shorter wall limits the water.

Moving the taller wall keeps the limiting wall unchanged.

Only moving the shorter wall gives a chance to increase the water height.

---

## Doubt 3

Did not fully understand the problem statement.

Correct understanding

Imagine each array element as the height of a vertical wall.

Choose any two walls.

They form a container.

Water is stored between them.

The water level always reaches only the shorter wall.

---

## Doubt 4

Confused between pointer values and array values.

Remember

left

↓

Index

height[left]

↓

Height at that index

Pointers store positions.

Arrays store values.

---

# Interview Lessons

✔ Draw the walls before thinking about code.

✔ Separate indices and heights.

✔ Water height is decided by the shorter wall.

✔ Width is the distance between indices.

✔ Move only the shorter pointer.

✔ Always keep track of the maximum area found so far.

---

# Personal Learning Note

The biggest breakthrough in this problem was understanding the visualization first.

Once the walls and water concept became clear, the algorithm became much easier to derive instead of memorizing it.