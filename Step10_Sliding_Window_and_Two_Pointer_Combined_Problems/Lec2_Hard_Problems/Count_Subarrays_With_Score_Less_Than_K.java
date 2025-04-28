public class Count_Subarrays_With_Score_Less_Than_K {
    
    public long countSubarrays(int[] nums, long k) {
        long count = 0, sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left++];
            }
            count += (right - left + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Count_Subarrays_With_Score_Less_Than_K solution = new Count_Subarrays_With_Score_Less_Than_K();
        int[] nums = {1, 2, 3, 4};
        long k = 10;
        long result = solution.countSubarrays(nums, k);
        System.out.println("The number of subarrays with score less than " + k + " is: " + result);
    }
}
