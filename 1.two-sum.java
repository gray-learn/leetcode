/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                ans[0] = i;
                ans[1]=map.get(diff);
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;

    }
}
// @lc code=end

