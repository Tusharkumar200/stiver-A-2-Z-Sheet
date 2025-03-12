import java.util.HashMap;
import java.util.Map;

public class Subarrays_with_K_Different_Integers {
    
    public int subarraysWithKDistinct(int[] nums, int k) {
        
         int l=0, r=0 ,count=0;
         Map<Integer, Integer> map = new HashMap<>();
        
         while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while(map.size() <=k){
                map.put(nums[l], map.get(nums[l]) - 1);

                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l = l-1;
            }
            count = count + (r-l+1);
            r= r+1;
         }
         return count;
    }
    public static void main(String[] args) {
        Subarrays_with_K_Different_Integers solution = new Subarrays_with_K_Different_Integers();
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int result = solution.subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with " + k + " different integers: " + result);
    }
}
