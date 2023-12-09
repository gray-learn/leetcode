/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null) return traversal;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            while(size != 0){
                TreeNode tmp = queue.poll();
                currLevel.add(tmp.val);
                if(tmp.left != null) queue.add(tmp.left);
                if(tmp.right != null) queue.add(tmp.right);
                size -- ;
            }
            traversal.add(currLevel);
        }
        return traversal;
    }
}
// @lc code=end

