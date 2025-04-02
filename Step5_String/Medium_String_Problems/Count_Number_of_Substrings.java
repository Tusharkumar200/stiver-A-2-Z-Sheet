import java.util.HashMap;
import java.util.Map;

public class Count_Number_of_Substrings {
    
     int countSubstr(String s, int k) {
         Map<Character, Integer> charCountMap = new HashMap<>();
        int n = s.length();
        int longestSubstringLength = 0; 
         int left = 0;

         for(int right=0; right <n; right++)
         {
         char currentChar = s.charAt(right);
         charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
         
         while(charCountMap.size() > k){
            char leftChar = s.charAt(left);
            charCountMap.put(leftChar, charCountMap.get(leftChar) - 1);
             if (charCountMap.get(leftChar) == 0) {
                    charCountMap.remove(leftChar);
                }
                left++;
            }
            longestSubstringLength = Math.max(longestSubstringLength, right - left + 1);
         }
     }
        return longestSubstringLength;
    }
    public static void main(String[] args) {
        
    }
}
