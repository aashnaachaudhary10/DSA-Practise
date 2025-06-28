# Move Zeroes

📌 **LeetCode Link:** [Move Zeroes](https://leetcode.com/problems/move-zeroes/)

---

### ❓ Problem Statement:

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.  
Do this in-place without making a copy of the array.

---

### 🔍 Example:

**Input:**  
`nums = [0,1,0,3,12]`

**Output:**  
`[1,3,12,0,0]`

---

### ✅ Approach: Two-Pointer In-Place Shift

- Use a **pointer (`index`)** to track where the next non-zero element should go.
- Iterate through the array:
  - If the current element is not zero, place it at `nums[index]` and increment `index`.
- After placing all non-zero elements, fill the rest with zeroes.

---

### 💻 Code (Java):

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the rest with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}


⏱️ Time & Space Complexity:
Time: O(n) — single pass through array

Space: O(1) — in-place, no extra memory used

