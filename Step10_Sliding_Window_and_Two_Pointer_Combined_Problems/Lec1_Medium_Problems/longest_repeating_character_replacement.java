import java.util.HashMap;

public class longest_repeating_character_replacement {
    
    public int characterReplacement(String s, int k) {
         HashMap<Character, Integer> freqs = new HashMap<>();
        int res = 0, i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(c));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freqs.put(left, freqs.get(left) - 1);
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        longest_repeating_character_replacement solution = new longest_repeating_character_replacement();
        String s = "AABABBA";
        int k = 1;
        int result = solution.characterReplacement(s, k);
        System.out.println("The result is: " + result); // Expected output: 4
    }
}
