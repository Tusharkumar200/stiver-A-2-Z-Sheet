package BS_on_1D_Arrays;
public class Last_occurrence_in_a_sorted_array {
    
    private static int findFirstPosition(int[] nums, int target) {
            
            int n = nums.length;
            int left = 0;
            int right = n-1;
            int firstPosition = -1;

            while (left <= right) {
                int mid = (left + right)/2;

                if(nums[mid] == target){
                    firstPosition = mid;
                    right = mid -1;
                }
                else if(nums[mid ]< target){
                    left = mid +1;
                }
                else{
                    right = mid -1;
                }
            }

            return firstPosition;
    }

    private static int findLastPosition(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int lastPosition = -1;

        while (left <= right) {
            int mid = (left + right)/2;

            if(nums[mid] == target){
                lastPosition = mid;
                left = mid +1;
            }
            else if(nums[mid] < target){
                left = mid+1;   
            }
            else{
                right = mid -1;
            }

        }
        return lastPosition;
    }

    public static int[] searchRange(int[] nums, int target) {
            int result[] = new int[2];

            result[0] =findFirstPosition(nums, target); 
            result[1] =findLastPosition(nums, target);
            return result;

    }

    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int res[] = searchRange(nums1, target1);
        
        for(int i: res){
            System.out.println(i);
        }
    }
}
