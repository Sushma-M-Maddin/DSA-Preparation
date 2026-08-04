# Merge Sorted Array - Mistakes & Learning Notes

---

# Coding Mistakes

None.

The difficulty was understanding the algorithm.

---

# Conceptual Doubts

## Doubt 1

Initially I thought of writing from the front.

Problem

Writing from the front overwrites valid elements before they are processed.

Correct understanding

Write from the back because empty spaces already exist there.

---

## Doubt 2

I kept thinking about pointer values instead of pointer responsibilities.

Correct understanding

First ask:

"What does this pointer represent?"

Then its initial value becomes obvious.

i

Last valid element in nums1

↓

m - 1

j

Last element in nums2

↓

n - 1

k

Last writable position

↓

m + n - 1

---

## Doubt 3

I was comparing

i

and

j

instead of

nums1[i]

and

nums2[j]

Correct understanding

Pointers only tell us where to look.

We always compare values.

---

## Doubt 4

I did not know which pointer should move.

Memory Trick

Ask yourself

"Which value did I use?"

If nums1[i] was copied

↓

i--

If nums2[j] was copied

↓

j--

Always

k--

because one position has been filled.

---

## Doubt 5

I found it difficult to write algorithms.

Reason

I tried writing the whole algorithm at once.

Correct understanding

Break the algorithm into questions.

1. What are the pointers?

2. What does each pointer represent?

3. Where do I write?

4. What do I compare?

5. Which value do I place?

6. Which pointer moves?

7. When do I stop?

Answering these questions automatically creates the algorithm.

---

# Interview Lessons

✔ Always identify where empty space exists.

✔ Never overwrite data that has not been processed.

✔ Think about pointer responsibilities before pointer values.

✔ Compare values, not pointers.

✔ Move the pointer whose value was used.

✔ Build algorithms by answering small logical questions instead of trying to write everything at once.