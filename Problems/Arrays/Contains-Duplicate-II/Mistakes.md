# Contains Duplicate II - Mistakes & Notes

---

# Conceptual Mistakes

## Mistake 1

Checked duplicates in entire array.

Correct

👉 Only check within last k elements

---

## Mistake 2

Did not understand why removal is needed.

Correct

👉 Remove nums[i - k] because it is outside allowed distance

---

## Mistake 3

Wrong order of operations

Incorrect

Add → Remove → Check ❌

Correct

Check → Add → Remove ✅

---

# Key Learnings

✔ Sliding window maintains valid range  
✔ HashSet gives O(1) lookup  
✔ Window size must be at most k  
✔ Removal is required to enforce distance constraint  

---

# Interview Notes

If interviewer asks:

"Why remove elements?"

Answer:

To ensure we only check duplicates within distance k, not across the entire array.

---

# Personal Insight

The most important realization was that we are not checking for duplicates globally, but only within a moving window of size k.