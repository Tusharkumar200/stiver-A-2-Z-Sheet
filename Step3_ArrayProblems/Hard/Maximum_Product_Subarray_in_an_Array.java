

public class Maximum_Product_Subarray_in_an_Array {

    /**
     * This method calculates the maximum product of a contiguous subarray within a given array of integers.
     *
     * @param nums An array of integers.
     * @return The maximum product of a contiguous subarray.
     *
     * The algorithm uses dynamic programming to keep track of the maximum and minimum products up to the current position.
     * It iterates through the array, updating the maximum and minimum products at each step, and keeps track of the overall maximum product.
     *
     * Example:
     * Input: nums = [2,3,-2,4]
     * Output: 6
     * Explanation: The subarray [2,3] has the largest product 6.
     */
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxs = nums[0];
        int mins = nums[0];
        int result = nums[0];

        for(int i = 1; i<n;i++){
            // int temp = maxs;

            int temp = Math.max( nums[i],Math.max(maxs*nums[i],mins*nums[i]));
            mins = Math.min(nums[i],Math.min(maxs*nums[i],mins*nums[i]));
            
            maxs = temp;
            result = Math.max(result,maxs);

        }

        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(maxProduct(arr));
    }
}
