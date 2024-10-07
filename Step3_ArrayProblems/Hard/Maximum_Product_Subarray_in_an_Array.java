package Hard;

public class Maximum_Product_Subarray_in_an_Array {

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int result = 0;

        for(int i = 1; i<n;i++){
            int temp = max;

            max = Math.max(max * nums[i] , nums[i]);
            min = Math.min(temp * nums[i] , nums[i]);


        }

        if(max > result){
            result = max;
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(maxProduct(arr));
    }
}
