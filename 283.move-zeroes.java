/*
 * Array
 * @lc app=leetcode id=283 lang=java
 *  
 * [283] Move Zeroes
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        // this.queueSolution(nums);
        this.pointSolution(nums);
    }

    private void   pointSolution(int[] nums) {
        // TC: O(n) SC:O(1)
        // L -> R (no 0)
        // R -> L (0)
        // L -> R ->
        int l = 0;
        for(int r = 0; r< nums.length ; r++){
            // r -> l (!=0)
            if(nums[r]!=0){
                nums[l] = nums [r];
                //  next value 
                l++;
            }
        }
        // from index left to nums.length - 1, ,with 0's
        for(int i = l; i< nums.length; i++){
            nums[i]=0;
        }
    }

    private void   queueSolution(int[] nums) {
        // TC: O(n) SC:O(n)
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != 0){
                queue.add(nums[i]);
            }
        }

        int index = 0;
        // not 0
        while(queue.size()!=0){
            nums[index] = queue.poll();
            index++;
        }

        // rest 0 
        for(int i = index; i< nums.length; i++){
            nums[i] = 0;
        }
        
    }


} 
// @lc code=end

