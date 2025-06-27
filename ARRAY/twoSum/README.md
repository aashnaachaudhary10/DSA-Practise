# 🧮 Two Sum

> LeetCode Problem: [Two Sum](https://leetcode.com/problems/two-sum/)  
> Difficulty: Easy  
> Tag(s): Array, HashMap, Brute Force

---

## 📝 Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

---

## 💡 Approach

### ✅ Optimal Approach – HashMap (O(n) Time)

We use a HashMap to store the **value → index** while iterating through the array. For each element, we compute the complement (`target - nums[i]`) and check if it already exists in the map.

- If it exists: return `[index_of_complement, current_index]`
- Else: store the current element and its index in the map

---

## 📦 Code (Java)

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // No solution
    }
}


Time and Space Complexity
Approach	  Time Complexity	Space Complexity
Brute Force	   O(n²)	          O(1)
HashMap      	O(n)	          O(n)




✅ Sample Input / Output
vbnet
Copy
Edit
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].