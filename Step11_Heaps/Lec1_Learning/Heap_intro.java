import java.util.PriorityQueue;

class Heap_intro{

    // heap data structure
    public static void heap(){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // adding element
        minHeap.add(10);
        minHeap.add(90);
        minHeap.add(70);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());  
        }
    }
    public static void main(String[] args) {
        heap();
    }
}