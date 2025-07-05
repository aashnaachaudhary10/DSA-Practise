# 🔗 Leetcode Problem 100 – Same Tree

## 📄 Problem Statement
Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if:
- They are structurally identical.
- The nodes have the same value.

---

## 💻 Example

### Input:
p = [1,2,3]
q = [1,2,3]

shell
Copy
Edit

### Output:
true

csharp
Copy
Edit

---

## ✅ Approach: Recursive DFS

- Compare root nodes.
- Recursively check left and right children.
- Base cases:
  - If both nodes are `null`, return `true`.
  - If only one is `null`, return `false`.
  - If values mismatch, return `false`.

---
🧠 Time & Space Complexity
Time Complexity: O(n), where n is the number of nodes.

Space Complexity: O(h), where h is the height of the tree (due to recursion stack).

