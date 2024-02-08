/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 =0,p2=0;
        while(p1<s.length() && p2< t.length()){
            if(s.charAt(p1)==t.charAt(p2)){
                p1 ++;
                p2++;
            } else{
                p2++;
            }
        }
        return p1 == s.length();
    }
    // TC:O(n) SC:O(1)constant
}
// @lc code=end

