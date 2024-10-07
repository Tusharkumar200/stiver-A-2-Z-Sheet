package Hard;

public class Maximum_Product_Subarray_in_an_Array {

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
