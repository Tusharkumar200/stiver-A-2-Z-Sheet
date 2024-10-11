package Hard;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Merge_Overlapping_Sub_intervals {
    
    //*BruteForce Approched
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
            int n = arr.length;
            List<List<Integer>> ans = new ArrayList<>();
            
            // sort the array
            Arrays.sort(arr, new Comparator<int[]>(){
                    public int compare(int[]a , int[]b){
                        return a[0] - b[0];
                    }
            });

            for(int i=0; i<n; i++){
                int start = arr[i][0];
                int end = arr[i][1];

                if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)){
                    continue;
                }

                for(int j=i=1; j<n ; j++){

                    if(arr[j][0] <=end){
                        end = Math.max(end,arr[j][i]);
                    }
                    else{
                        break;
                    }
                }
                ans.add(Arrays.asList(start,end));
            }
            return ans;
    }

    
    // * Optimal Approched

    public static List<List<Integer>> optimizeVersion(int[][] arr){
                int n = arr.length;
                Arrays.sort(arr, new Comparator<int[]>(){
                    public int compare(int[]a  ,int[] b){
                        return a[0] - b[0];
                    }
                });
                List<List<Integer>> ans = new ArrayList<>();

                for(int i=0; i<n; i++){
                    
                }

                return ans;
    }
    
    public static void main(String[] args) {
        
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        // List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        List<List<Integer>> ans = optimizeVersion(arr);

        System.out.print("The merged intervals are: \n");

        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
