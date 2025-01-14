package Lec_2_Subsequences_Pattern;

import java.util.List;
import java.util.ArrayList;

public class PrintSum {
    
    boolean printS(int ind, List<Integer> ds, int s, int sum, int arr[], int n) {
        if (ind == n) {
            if (s == sum) {
                for (Integer i : ds) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return true;
            } else {
                return false;
            }
        }
        ds.add(arr[ind]);
        s += arr[ind];

        if (printS(ind + 1, ds, s, sum, arr, n)) {
            return true;
        }

        ds.remove(ds.size() - 1);
        s -= arr[ind];

        if (printS(ind + 1, ds, s, sum, arr, n)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PrintSum ps = new PrintSum();
        int[] arr = {1, 2, 1};
        int sum = 2;
        List<Integer> ds = new ArrayList<>();
        ps.printS(0, ds, 0, sum, arr, arr.length);
    }
}
