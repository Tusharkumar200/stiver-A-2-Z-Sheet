package Lec_2_Subsequences_Pattern;

import java.util.ArrayList;
import java.util.Collections;

public class Subset_Sum_1 {
    
    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
            
    }

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

    }

    public static void main(String[] args) {
        
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}
