# 🧠 Leetcode 83 - Remove Duplicates from Sorted Linked List

## 📌 Problem Statement

Given the `head` of a **sorted** linked list, delete all duplicates such that each element appears only once.  
Return the **linked list sorted as well**.

> [Leetcode Link](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

---

## 🧪 Example

### 🔹 Input:
head = [1, 1, 2, 3, 3]

shell
Copy
Edit

### 🔹 Output:
[1, 2, 3]

yaml
Copy
Edit

---

## ✅ Constraints

- The number of nodes in the list is in the range `[0, 300]`.
- `-100 <= Node.val <= 100`
- The list is sorted in **non-decreasing order**.

---

## 💡 Approach

- Since the list is sorted, duplicate elements will be **next to each other**.
- Traverse the list using a `current` pointer.
- If the value of the current node equals the next node:
  - Skip the next node using `current.next = current.next.next`.
- Else, move to the next node.

### ⏱ Time Complexity:
- **O(n)** – Traverse the list once

### 📦 Space Complexity:
- **O(1)** – No extra space used

---
