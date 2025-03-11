import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_with_At_Most_K_Distinct_Characters {
    // Longest substring

    public static int  longestSubstring(String s , int k){
        int maxlen=0,l=0,r=0;
         Map<Character, Integer> freqMap = new HashMap<>();

         while (r <= s.length() ) {
            freqMap.put(s.charAt(r), freqMap.getOrDefault(s.charAt(r), 0) + 1);

            while(freqMap.size() > k){
                freqMap.put(s.charAt(l), freqMap.get(s.charAt(l)) - 1);
                if(freqMap.get(s.charAt(l)) == 0){
                    freqMap.remove(s.charAt(l));
                }
                l = l+1;
            }

            if(freqMap.size() <= k){
                maxlen = Math.max(maxlen , r-l+1);
            }
            r = r+1;
         }
         return maxlen;
    }
    public static void main(String[] args) {
        
    }
}
