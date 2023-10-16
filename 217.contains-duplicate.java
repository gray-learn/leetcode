/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //// sort TC O(nlogn) SC O(1)
        // SET sort TC O(n) SC O(n)
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
        
    }
}
// @lc code=end

