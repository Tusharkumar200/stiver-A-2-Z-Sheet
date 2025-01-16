package Lec_2_Subsequences_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_2 {
    
    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {

        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i<arr.length; i++){
            if( i> ind && arr[i] == arr[i-1])continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i+1, arr,  target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates , target, ans , new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        Combination_Sum_2 combinationSum2 = new Combination_Sum_2();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = combinationSum2.combinationSum2(candidates, target);
        System.out.println(result);
    }
}
