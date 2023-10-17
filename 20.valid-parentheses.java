/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character ,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>(); //SC O(n)
        for(int i = 0 ; i<s.length();i++){ // TC: O(n)
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                char pop = stack.size()!= 0 ? stack.pop()// remove top element
                : '#';
                if(pop != map.get(curr)){
                    return false;
                }
            } else{ // open bracket
                stack.push(curr);
            }
        }
        // return true; //[({})
        return stack.isEmpty();
     }
}
// @lc code=end

