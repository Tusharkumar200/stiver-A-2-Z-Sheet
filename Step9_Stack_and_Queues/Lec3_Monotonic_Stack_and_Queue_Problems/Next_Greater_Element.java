import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Next_Greater_Element {
    
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
      
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
      
        int n = nums1.length;
        int[] result = new int[n];
      
        for (int i = 0; i < n; ++i) {
            // If nums1[i] has a next greater element in nums2, use it; otherwise, use -1
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        return result;
        
    }
    public static void main(String[] args) {
        Next_Greater_Element nge = new Next_Greater_Element();
        int[] nums1 = {5, 7, 1, 2, 6, 0};
        int[] nums2 = {6, 5, 7, 1, 2, 0};

        int[] result = nge.nextGreaterElement(nums1, nums2);
        System.out.println("The next greater elements are:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

