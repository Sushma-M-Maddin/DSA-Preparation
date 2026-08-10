# Maximum Average Subarray - Mistakes & Notes

---

# Coding Mistakes

## Mistake 1

Returned maxSum instead of average.

Incorrect

```java
return maxSum;
```

Correct

```java
return (double) maxSum / k;
```

---

## Mistake 2

Forgot type casting

```java
maxSum / k   ❌ integer division
```

Correct

```java
(double) maxSum / k   ✅
```

---

# Conceptual Mistakes

## Mistake 1

Tried to calculate average directly every time.

Better approach

👉 Calculate sum  
👉 Divide once at the end  

---

## Mistake 2

Confused between array average and subarray average.

Correct understanding

👉 Only subarrays of size `k` matter  

---

# Key Learnings

✔ Sliding window avoids recomputation  
✔ Fixed window size = constant `k`  
✔ Max average = max sum / k  
✔ Reuse previous window sum  

---

# Interview Notes

If interviewer asks:

"Why optimize?"

Answer:

Sliding window reduces time complexity from O(n × k) to O(n) by reusing previous computations.