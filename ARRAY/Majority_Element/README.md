# Majority Element

📌 **LeetCode Link:** [Majority Element](https://leetcode.com/problems/majority-element/)

---

### ❓ Problem Statement:

Given an array `nums` of size `n`, return **the majority element**.  
The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

---

### 🔍 Example:

**Input:**  
`nums = [3,2,3]`  
**Output:**  
`3`

**Input:**  
`nums = [2,2,1,1,1,2,2]`  
**Output:**  
`2`

---

✅ Approach : Boyer-Moore Voting Algorithm (Optimal)
Maintain a candidate and a count.

Cancel out every different number with the current candidate.

The remaining candidate will be the majority.

💻 Java Code:
class Majorityelement {
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate=0;


        for(int i=0;i<nums.length;i++){
            int num = nums[i];


            if(count==0){
                candidate=num;
            }

            if(num==candidate){
                count+=1;

            }else{
                count-=1;
            }
        }
        return candidate;
    }
}




⏱️ Time & Space Complexity:
Approach	Time	Space
HashMap	O(n)	O(n)
Boyer-Moore	O(n)	O(1) ✅