import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class _4_Sum {

    // *BruteForce Approched
    public static List<List<Integer>> fourSum(int[] num, int target) {
        int n = num.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    for (int l = k + 1; l < n; l++) {

                        long sum = (long) num[i] + num[j];
                        sum += num[k];
                        sum += num[l];

                        if (sum == target) {

                            List<Integer> temp = Arrays.asList(num[i], num[j], num[k], num[l]);
                            Collections.sort(temp);
                            set.add(temp);

                        }
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;

    }

    // *Better Approched using fornula(a+b +c=0 --> -c = a+b);
    public static List<List<Integer>> fourSum_BetterApproched(int[] nums, int target) {

        int n = nums.length; // size of the array
        Set<List<Integer>> st = new HashSet<>();

        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {

                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    if (hashset.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    hashset.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    // * Optimal approched
    public static List<List<Integer>> fourSum_OptimalApproched(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 4) return ans;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) k++; 
                        while (k < l && nums[l] == nums[l + 1]) l--; 
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        int[] nums = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        int target = 9;
        // List<List<Integer>> ans = fourSum(nums,target);
        // List<List<Integer>> ans = fourSumBetterApproched(nums, target);
        List<List<Integer>> ans = fourSum_OptimalApproched(nums, target);
        System.out.println(ans);
    }
}
