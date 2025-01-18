package Lec_2_Subsequences_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_2 {

    public static void fun(int[] nums, int index, List<Integer> ds, List<List<Integer>> res) {
        res.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue; // skip duplicates
            ds.add(nums[i]);
            fun(nums, i + 1, ds, res);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort the array to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        fun(nums, 0, ds, ans);
        return ans;
    }

    static void printAns(List<List<Integer>> ans) {
        System.out.println("The unique subsets are:");
        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }

    public static void main(String[] args) {
        int nums[] = {4, 1, 0};
        List<List<Integer>> ans = subsetsWithDup(nums);
        printAns(ans);
    }
}
