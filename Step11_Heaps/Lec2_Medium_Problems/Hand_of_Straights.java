import java.util.PriorityQueue;

public class Hand_of_Straights {
    
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length % W != 0) return false;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int elem: hand) minHeap.add(elem);

        while(!minHeap.isEmpty()){
            int head = minHeap.poll();
            for(int i=1; i<W; i++)
                if(!minHeap.remove(head+i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Hand_of_Straights solution = new Hand_of_Straights();
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int W = 3;
        boolean result = solution.isNStraightHand(hand, W);
        System.out.println("Can the hand be rearranged into groups of " + W + "? " + result);
    }
}
