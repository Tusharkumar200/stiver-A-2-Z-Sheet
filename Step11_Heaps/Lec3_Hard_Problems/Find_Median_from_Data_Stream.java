import java.util.Collection;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {
    
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    
    public Find_Median_from_Data_Stream(){
        minHeap = new PriorityQueue();
        maxHeap = new PriorityQueue<>(Collection.reverseOrer());
    }
    public void addNum(int num) {
        maxHeap.add(nums);
        maxHeap.add(maxHeap.poll());
        if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }

    }
    
    public double findMedian() {    
        return maxHeap.size() == minHeap.size() ? (maxHeap.peek() + minHeap.peek())/2.0 : maxHeap.peek();
    }
    public static void main(String[] args) {
        
    }
}
