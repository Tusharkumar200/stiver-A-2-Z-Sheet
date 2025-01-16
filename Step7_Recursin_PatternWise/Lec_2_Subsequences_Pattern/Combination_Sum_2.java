package Lec_2_Subsequences_Pattern;

import java.util.Arrays;
import java.util.List;

public class Combination_Sum_2 {
    
    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates , target, ans , new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
