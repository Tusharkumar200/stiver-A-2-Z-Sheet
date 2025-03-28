import java.util.Arrays;

public class Valid_Anagram {
    
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m!=n){
            return false;
        }
        else{
            int cnt[] = new int[26];

            for(int i=0; i<m;i++){
                cnt[s.charAt(i) - 'a']++;
            }

            for(int i=0; i<n;i++){
                cnt[t.charAt(i) - 'a']--;
            }
            for(int i=0; i<cnt.length;i++){
                
                if(cnt[i] !=0){
                    return false;
                }
            }
            return true;
            
        }

    }

    // second approched
    public boolean isAnagramSecond(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

         
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        Valid_Anagram validAnagram = new Valid_Anagram();
        String s = "anagram";
        String t = "nagaram";

        if (validAnagram.isAnagram(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
