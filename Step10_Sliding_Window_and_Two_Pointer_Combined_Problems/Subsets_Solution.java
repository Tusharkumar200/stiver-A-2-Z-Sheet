package Step8_Bit_Manipulation.Lec1_Learn_Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsetCount = 1 << n; // Total subsets = 2^n
        List<List<Integer>> ans = new ArrayList<>();

        for (int num = 0; num < subsetCount; num++) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    res.add(nums[i]);
                }
            }
            ans.add(res);
        }
        return ans;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = solution.subsets(nums);

        System.out.println("Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

    }
}
