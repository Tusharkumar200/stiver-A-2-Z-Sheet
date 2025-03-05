import java.util.HashMap;
import java.util.Map;

public class Fruit_Into_Baskets {
    
    public static int totalElements(Integer[] arr) {
        
        int left = 0, maxLength = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {
            freqMap.put(arr[right], freqMap.getOrDefault(arr[right], 0) + 1);

            while (freqMap.size() > 2) {
                freqMap.put(arr[left], freqMap.get(arr[left]) - 1);
                if (freqMap.get(arr[left]) == 0) {
                    freqMap.remove(arr[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 1, 2, 3};
        System.out.println(totalElements(arr));
    }
}
