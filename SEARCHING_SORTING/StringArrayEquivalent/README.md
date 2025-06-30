# Check If Two String Arrays are Equivalent 🔡

**Problem Link:** [LeetCode #1662](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)

## 🧠 Problem Statement

Given two string arrays `word1` and `word2`, return `true` if the two arrays represent the same string, and `false` otherwise.

A string is represented by an array if the array elements are concatenated in order.

### 🔸 Example:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation: "ab" + "c" == "a" + "bc" == "abc"


---

## ✅ Approach

We simply:
1. Concatenate all strings in `word1` → `String str1`
2. Concatenate all strings in `word2` → `String str2`
3. Compare both using `.equals()` method in Java

---

## 🧮 Time & Space Complexity

- **Time:** O(n + m), where n and m are lengths of `word1` and `word2`
- **Space:** O(n + m) for the concatenated strings

---

