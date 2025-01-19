package Lec_2_Subsequences_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_3 {

    static List<List<Integer>> result = new ArrayList<>();

    static void try_combination(List<Integer> combination , int k , int n , int start){

        if(k == combination.size()){

            if(n == 0){
                result.add(new ArrayList<Integer>(combination));
            }

            for(int i = start; i <=9; i++){
                combination.add(i);
                try_combination(combination, k,  n-i, i+1);
                combination.remove(combination.size()-1);
            }
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> combination = new ArrayList<>();
        try_combination(combination, k, n, 1);
        return result;

    }
    public static void main(String[] args) {
        
    }
}
