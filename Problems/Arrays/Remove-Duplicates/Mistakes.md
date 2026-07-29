# Remove Duplicates from Sorted Array - Mistakes

---

# Coding Mistakes

## Mistake 1

I wrote:

```java
if(arr[left] == arr[right]){
    right++;
}
```

### Why it is wrong

The Reader pointer should move after processing every element.

Whether the element is duplicate or unique,

its job is complete after checking.

Correct approach:

```java
while(right < arr.length){

    if(arr[left] != arr[right]){
        left++;
        arr[left] = arr[right];
    }

    right++;
}
```

Lesson:

- Reader always moves.
- Writer moves only when writing.

---

## Mistake 2

Forgot to return:

```java
return left + 1;
```

Reason:

left stores the last valid index.

Number of valid elements = last index + 1.

---

# Conceptual Doubts

## Doubt 1

### Why do we return `left + 1`?

The algorithm does not create a new array.

It overwrites the beginning of the same array.

Example:

Before

1 1 2 2 3 4 4 5

After

1 2 3 4 5 4 4 5

Only the first `left + 1` elements are valid.

---

## Doubt 2

### Where is the unique array stored?

There is no separate array.

The unique values are stored in the beginning of the same array.

The remaining values are ignored.

---

## Doubt 3

### Why is `right++` outside the if statement?

The Reader pointer has only one responsibility:

Read every element exactly once.

After checking an element,

its work is complete,

so it always moves.

The Writer moves only when a new unique value is found.

---

# Interview Lessons

- Reader scans every element.
- Reader always moves.
- Writer stores only useful values.
- Writer moves only when writing.
- The array is modified in-place.
- Only the first `left + 1` elements are valid.
- Define the responsibility of each pointer before coding.