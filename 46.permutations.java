/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void dfs(int[] nums, List<List<Integer>> list, List<Integer> perm) {
        if (perm.size() == nums.length) {
            list.add(new ArrayList<>(perm)); // Add a copy of current permutation to the result list
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (perm.contains(nums[i])) continue;// Skip already used numbers

            perm.add(nums[i]); // Choose
            dfs(nums, list, perm); // Explore
            perm.remove(perm.size() - 1); // Un-choose (Backtrack)
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates (if any)
        List<List<Integer>> list = new ArrayList<>(); // Result list to hold all permutations
        dfs(nums, list, new ArrayList<>()); // Call DFS to generate permutations
        return list;
    }
}// @lc code=end
// TC O(n*logn)+O(n* n!)
//O(n*logn): sort
//O(n* n!)
// SC: O(n)

