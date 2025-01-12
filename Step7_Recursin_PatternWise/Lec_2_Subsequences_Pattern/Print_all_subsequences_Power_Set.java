package Lec_2_Subsequences_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Print_all_subsequences_Power_Set {

    public static void subsequences(int i, String s, String f) {

        if (i == s.length()) {

            System.out.print(f + " ");
            return;
        }

        subsequences(i + 1, s, f + s.charAt(i));

        subsequences(i + 1, s, f);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, result);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubsets(index + 1, nums, current, result);

    }

    public static void main(String[] args) {
        String s = "abc";
        String f = "";
        System.out.println("All possible subsequences are: ");
        subsequences(0, s, f);

        int[] num = { 1, 2, 3 };
    }
}