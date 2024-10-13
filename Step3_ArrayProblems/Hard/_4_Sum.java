import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class _4_Sum {
    
    // *BruteForce Approched
    public static List<List<Integer>> fourSum(int[] num, int target){
        int n = num.length;
        Set<List<Integer>> set = new HashSet<>();


        for(int i=0; i < n; i++){
            for(int j = i+1 ; j< n; j++){

                for(int k=j+1; k<n; k++){

                    for(int l = k+1; l<n; l++){

                        long sum = (long)num[i] + num[j];
                        sum += num[k];
                        sum+= num[l];

                        if(sum == target){

                            List<Integer> temp =  Arrays.asList(num[i], num[j], num[k], num[l]);
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

    public static void main(String[] args) {
       int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum(nums,target);
        System.out.println(ans);
    }
}
