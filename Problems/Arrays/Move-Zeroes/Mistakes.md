# Mistakes - Move Zeroes

## ❌ Mistake 1

Used

```java
while(left < right)
```

instead of scanning until the end of the array.

---

## ❌ Mistake 2

Checked

```java
arr[left]
```

instead of

```java
arr[right]
```

The scanning pointer is always `right`.

---

## ❌ Mistake 3

Incorrect swap logic.

Forgot to restore the saved value using `temp`.

---

## 💡 What I Learned

- Every pointer has a specific job.
- The scanning pointer decides the loop condition.
- Don't memorize the code. Understand the role of each variable.

---

## 🎯 Interview Reminder

left

↓

Write position

right

↓

Scanning pointer

Loop

```java
while(right < arr.length)
```