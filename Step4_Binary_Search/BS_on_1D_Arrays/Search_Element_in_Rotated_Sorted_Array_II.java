package BS_on_1D_Arrays;
public class Search_Element_in_Rotated_Sorted_Array_II {

    public static boolean searchInARotatedSortedArrayII(int[] arr, int k) {

        /*
         * Linear Approched!
         * for(int i: arr){
         * if(i == k) return true;
         * }
         * return false;
         * 
         */

        // Binary Search!
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) return true;

            // Edge case: if arr[low], arr[mid], and arr[high] are equal
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // If the left part is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // If the right part is sorted
            else {
                if (arr[mid] < k && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 }, k = 0;
        boolean ans = searchInARotatedSortedArrayII(arr, k);

        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
