import java.util.Collection;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {
    
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    
    public Find_Median_from_Data_Stream(){
        minHeap = new PriorityQueue<Integer>(); // Min-heap for the larger half
        maxHeap = new PriorityQueue<Integer>(java.util.Collections.reverseOrder()); // Max-heap for the smaller half
    }
    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        // Balance the heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double addNum() {    
        return maxHeap.size() == minHeap.size() ? (maxHeap.peek() + minHeap.peek())/2.0 : maxHeap.peek();
    }
    public static void main(String[] args) {
        Find_Median_from_Data_Stream medianFinder = new Find_Median_from_Data_Stream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); // Output: 1.5
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); // Output: 2.0
    }
}
