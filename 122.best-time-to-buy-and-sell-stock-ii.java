/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {\
        int profit = 0 ;
        for(int i = 1; i< prices.length; i++){// [end] start
            // i-1, i
            if(prices[i-1] < prices[i])
            profit += prices[i] - prices [ i-1];
        }
        return profit;// TC:O(n), SC: O(1)
    }
}
// @lc code=end

