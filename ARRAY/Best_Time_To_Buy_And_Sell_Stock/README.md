# Best Time to Buy and Sell Stock

📌 **LeetCode Link:** [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

### ❓ Problem Statement:
You are given an array `prices` where `prices[i]` is the price of a given stock on the i-th day.  
You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell that stock.  
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

---

### ✅ Approach: Greedy

- Track the **minimum price** seen so far.
- For each price, calculate the **profit** by subtracting the min price.
- Update `maxProfit` whenever a higher profit is found.

---

### 💡 Code (Java):

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];  
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;  
                }
            }
        }

        return maxProfit;
    }
}



⏱️ Time & Space Complexity:
Time: O(n)

Space: O(1)