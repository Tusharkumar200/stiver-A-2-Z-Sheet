
public class Search_Element_in_a_Rotated_Sorted_Array {

    public static int search(int nums[], int n, int k) {

        /*
         * Linear Search
         * for(int i=0; i<n;i++){
         * if(nums[i] == k) return i;
         * }
         * return -1;
         */

         // using binary search
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == k)
                return mid;

            if (nums[low] <= nums[mid]) {

                if (nums[low] <= k && k <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else{
                if(nums[mid] <= k && k <= nums[high]){

                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int k = 1;
        int ans = search(arr, n, k);
        System.out.println(ans);
    }
}
