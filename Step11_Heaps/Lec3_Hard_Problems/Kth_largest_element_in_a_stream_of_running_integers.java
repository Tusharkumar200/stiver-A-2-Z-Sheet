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
        
    }
}
