import java.util.HashMap;


public class Subarrays_with_K_Different_Integers {
    private int helper(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0, res = 0;
        for (int r = 0; r < nums.length; r++) {
            if (mp.getOrDefault(nums[r], 0) == 0)
                k--;
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (k < 0) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                if (mp.get(nums[l++]) == 0)
                    k++;
            }
            res += r - l + 1;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return helper(nums, k) - helper(nums, k - 1);
    }
    public static void main(String[] args) {
        Subarrays_with_K_Different_Integers solution = new Subarrays_with_K_Different_Integers();
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int result = solution.subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with " + k + " distinct integers: " + result);
    }
}
