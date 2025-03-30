import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Sort_Characters_by_frequency {

    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        pq.addAll(hm.entrySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Sort_Characters_by_frequency sorter = new Sort_Characters_by_frequency();
        String input = "tree";
        String sorted = sorter.frequencySort(input);
        System.out.println("Input: " + input);
        System.out.println("Sorted by frequency: " + sorted);
    }

}
