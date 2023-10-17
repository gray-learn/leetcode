/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {
    // cycle sort
    // TC O(3n), SC:O(1)
    // TODO
    public int firstMissingPositive(int[] nums) {
        // preprocess [negative, 0 ]
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i]<=0){
                // any value 
                nums[i] = nums.length +1;// 1000
            }
        }
        // mark index
        for(int i = 0 ; i< nums.length; i++){
            int index = Math.abs(nums[i])-1; // -7 --> 6
            if(index< nums.length && nums[index] > 0 ){
                nums[index] = -1 * nums[index]; // -6
            }
        }
        // scan 
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return nums.length + 1; 
    }
}
// @lc code=end

