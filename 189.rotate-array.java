/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    // TC O(3n); SC: O(1)
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        // clear step
        k = k%len;
        //1234567
        //7654321
        reverse(nums, 0, len-1);
        //5674321
        reverse(nums, 0, k-1);
        //5671234
        reverse(nums, k, len-1);
        
    }

    private void reverse(int[]nums, int start, int end){
        while(start< end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            //
            start++;
            end--;
        }
        
    }
}
// @lc code=end

