/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // TC O(n) SC O(1)
        // DIFF
        // L index = 0
        // R index = 1
        // R -> L
        if(prices.length == 1) return 0 ;
        int profit = 0 ;
        int left = 0;
        for(int right = 1 ; right < prices.length ; right++){
            if(prices[right] > prices[left]){
                profit = Math.max(profit, prices[right] - prices[left]);
            }else{
                // TODO!!
                // compare L:0, R=1~m nonsense
                left = right;

            }
        }
        return profit;       
    }
}
// @lc code=end

