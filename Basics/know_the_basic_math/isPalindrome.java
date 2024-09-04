/*
 *Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.
 */


public class isPalindrome {
    
    public static boolean checkPalindrome(String str){
        
            String temp = str;
            

            for(char n = str.charAt(str.length() -1); n> .length();n++){

                char lastChar = str.charAt(str.length() - 1);



            }

            
        return false;
    }
    public static void main(String[] args) {
        
        String str = "ABCDCBA";

        boolean result =checkPalindrome(str);
        System.out.println(result);
    }
}
