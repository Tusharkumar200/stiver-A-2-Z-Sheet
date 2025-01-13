package Lec_2_Subsequences_Pattern;

import java.util.List;

public class Combination_Sum_1 {
    
    private void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {

    }

    public List < List < Integer >> combinationSum(int[] candidates, int target) {
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        Combination_Sum_1 sol = new Combination_Sum_1();
        List < List < Integer >> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
