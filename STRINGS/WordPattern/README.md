# 🧩 Leetcode Problem 290: Word Pattern

## 📝 Problem Statement
Given a `pattern` string and a sentence `s`, determine if `s` follows the same pattern. Each character in the pattern should map to one unique word and vice versa.

### 🔗 Link:
[Leetcode 290 - Word Pattern](https://leetcode.com/problems/word-pattern/)

---

## 🧠 Approach
We use two HashMaps:
- `mapCharToWord` to map pattern character → word
- `mapWordToChar` to map word → pattern character

We check for **bijective mapping** (one-to-one and onto).

---

## 💡 Example

**Input:**  
`pattern = "abba"`  
`s = "dog cat cat dog"`  
**Output:** `true`

**Explanation:**  
- a → dog  
- b → cat  
- Mapping is consistent throughout

---

⏱️ Time & Space Complexity
Time: O(n), where n is number of words

Space: O(n), for the two HashMaps

