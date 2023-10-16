/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        // last (from right to left)
        // R(start) --> L(end)
        // R- L 
        // TC:O(n) SC:O(1):L&R
        char[] nums = s.toCharArray();
        int len = nums.length;
        // for(int r = len-1; r>=0; r--){
        //     if(nums[r] == ' ') {
        //         continue;
        //     }
          // }
        int r = s.length() -1;
        while(r>=0&&s.charAt(r)==' '){
            r--;
        }
        int l = r;
        while(l>=0&&s.charAt(l)!=' '){
            l--;
        }
        return r-l;

        
    }
}
// @lc code=end

