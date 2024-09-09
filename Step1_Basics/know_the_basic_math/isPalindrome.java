/*
 *Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.
 */


public class isPalindrome {

    

    static boolean palindrome(String s) {
        return palindromeHelper(0, s);
    }
    static boolean palindromeHelper(int i, String s){
        
        // Base Condition
        // If i exceeds half of the string, means all the elements 
        // are compared, we return true.
        if(i>=s.length()/2) return true;
        
       
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        
       
        return palindromeHelper(i+1,s);
        

}
public static void main(String[] args) {

   
//    String s = "raceacar";
   String s = "A man, a plan, a canal: Panama";
   System.out.println(palindrome(s));
}
}
