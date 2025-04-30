import java.util.PriorityQueue;

public class Kth_largest_element_in_an_array {

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        int ans = minHeap.peek();
        return ans;
    }

    public static void main(String[] args) {

        Kth_largest_element_in_an_array obj = new Kth_largest_element_in_an_array();
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        int result = obj.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);

    }
}
