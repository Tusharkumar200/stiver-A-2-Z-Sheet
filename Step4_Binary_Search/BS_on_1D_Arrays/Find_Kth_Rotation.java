package BS_on_1D_Arrays;


public class Find_Kth_Rotation {
    
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
    
        while (low <= high) {
            int mid = (low + high) / 2;
    
            // If the current segment is sorted
            if (arr[low] <= arr[high]) {
                // If this segment's low element is the smallest we've seen, update 'ans' and 'index'
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                break; // Exit the loop since the minimum is found in this sorted segment
            }
    
            // Check if mid is the minimum
            if (arr[mid] < ans) {
                ans = arr[mid];
                index = mid;
            }
    
            // Decide which part to search next
            if (arr[mid] >= arr[low]) {
                // Left half is sorted, so move to the right half
                low = mid + 1;
            } else {
                // Right half is sorted, so move to the left half
                high = mid - 1;
            }
        }
    
        return index;
    }
    public static void main(String []a){
        int []arr = {3,4,5,1,2};
        int result = findKRotation(arr);
        System.out.println(result);
    }

}
