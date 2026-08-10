# Longest Substring Without Repeating Characters

## 🔗 LeetCode Link
https://leetcode.com/problems/longest-substring-without-repeating-characters/

---

## 🧠 Problem Statement

Given a string `s`, find the length of the longest substring without repeating characters.

---

## 💡 Intuition

We need a substring where:
- All characters are unique
- Substring must be continuous

👉 Use Sliding Window:
- Expand window using right pointer
- Shrink window using left pointer when duplicate found

---

## 🚀 Approach

1. Use a HashSet to store characters in current window
2. Traverse string using right pointer
3. If character already exists:
   - Remove characters from left until duplicate is removed
4. Add current character
5. Update maxLength

---

## 🧾 Algorithm
