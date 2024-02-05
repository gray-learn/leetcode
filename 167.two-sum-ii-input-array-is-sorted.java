/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0 , r = numbers.length -1;
        while(l<r){
            int sumOfPairs=numbers[l]+numbers[r] ;
            if(sumOfPairs== target){
                break; 
            }else if(sumOfPairs > target){
                //  sorted in non-decreasing order
                // -1 , 10 --> -1, 5
                r -- ;
            } else {
                l ++;
            }
        }
        return new int[] {l+1, r+1};
    }
}
// TC: O(n)
// SC: O(1)
// @lc code=end

