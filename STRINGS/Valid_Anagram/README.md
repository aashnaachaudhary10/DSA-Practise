# Valid Anagram

📌 **LeetCode Link:** [Valid Anagram](https://leetcode.com/problems/valid-anagram/)

---

### ❓ Problem Statement:

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **Anagram** is a word or phrase formed by rearranging the letters of another, using all the original letters exactly once.

---

### 🔍 Examples:

**Input:**  
`s = "anagram", t = "nagaram"`  
**Output:** `true`

**Input:**  
`s = "rat", t = "car"`  
**Output:** `false`

---

### ✅ Approach 1: Sorting

- Convert both strings to character arrays.
- Sort both arrays.
- Compare the sorted versions.

#### 💻 Java Code:

```java
class Validanagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--; 
        }
        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }
}



⏱️ Time & Space Complexity:
Approach	    Time	                Space
Sorting	       O(n log n)	             O(n)
HashMap Count	O(n)	             O(1) (Fixed 26 letters) ✅

