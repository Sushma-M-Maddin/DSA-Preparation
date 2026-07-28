# Mistakes - Reverse Array

## ❌ Mistake 1

### Mistake

I initialized:

```java
left = arr[0];
```

instead of

```java
left = 0;
```

### Why it is wrong

Pointers store **indexes**, not values.

Using

```java
left = arr[0];
```

can cause ArrayIndexOutOfBoundsException.

---

## ❌ Mistake 2

Forgot to perform swapping before moving the pointers.

---

## 💡 What I Learned

- Pointer variables always represent indexes.
- Swap first, then move pointers.
- Understand the job of every variable before writing code.

---

## 🎯 Interview Reminder

Pattern:

**Two Pointer**

Pointers:

- left → beginning
- right → end

Loop:

```java
while(left < right)
```