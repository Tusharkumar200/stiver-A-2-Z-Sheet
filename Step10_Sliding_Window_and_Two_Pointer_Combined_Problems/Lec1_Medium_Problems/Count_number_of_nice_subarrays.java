public class Count_number_of_nice_subarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            nums[i] %=2;
        }
        int[] prefixCount = new int[n+1];
        prefixCount[0] =1;
        int s =0;
        int ans =0;

        for(int num:nums){
            s+=num;
            if(s >=k){
                ans += prefixCount[s-k];
            }
            prefixCount[s]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Count_number_of_nice_subarrays solution = new Count_number_of_nice_subarrays();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int result = solution.numberOfSubarrays(nums, k);
        System.out.println("Number of nice subarrays: " + result);
    }
}
