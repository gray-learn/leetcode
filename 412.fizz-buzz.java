/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start

import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1;i<=n; i++){
      if(i%3 == 0 && i%5 == 0){
            ans.add("FizzBuzz");
        }
        }
  

        return ans;
    }
}
// @lc code=end

