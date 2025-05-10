import java.util.PriorityQueue;

public class Kth_largest_element_in_a_stream_of_running_integers {
    
    PriorityQueue<Integer>pq;
    int k;
    public Kth_largest_element_in_a_stream_of_running_integers(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if(pq.size()<k || val > pq.peek()){
            pq.offer(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        Kth_largest_element_in_a_stream_of_running_integers kthLargest = new Kth_largest_element_in_a_stream_of_running_integers(k, nums);

        System.out.println(kthLargest.add(3)); // Output: 4
        System.out.println(kthLargest.add(5)); // Output: 5
        System.out.println(kthLargest.add(10)); // Output: 5
        System.out.println(kthLargest.add(9)); // Output: 8
        System.out.println(kthLargest.add(4)); // Output: 8
    }
}
