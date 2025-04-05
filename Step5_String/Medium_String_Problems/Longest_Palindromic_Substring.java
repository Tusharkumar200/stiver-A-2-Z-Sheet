public class Longest_Palindromic_Substring {

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
           return s;
       }

       int maxLen = 1;
       String maxStr = s.substring(0, 1);

       for (int i = 0; i < s.length(); i++) {
           for (int j = i + maxLen; j <= s.length(); j++) {
               if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                   maxLen = j - i;
                   maxStr = s.substring(i, j);
               }
           }
       }

       return maxStr;
   }
    public static void main(String[] args) {
        Longest_Palindromic_Substring lps = new Longest_Palindromic_Substring();
        String input = "babad";
        String result = lps.longestPalindrome(input);
        System.out.println("Longest Palindromic Substring of \"" + input + "\" is: \"" + result + "\"");
    }
}
