/*
 *Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.
 */


public class isPalindrome {

    

    static boolean palindrome(int i, String s){
        
        // Base Condition
        // If i exceeds half of the string, means all the elements 
        // are compared, we return true.
        if(i>=s.length()/2) return true;
        
       
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        
       
        return palindrome(i+1,s);
        

}
public static void main(String[] args) {

   
//    String s = "race a car";
   String s = "A man, a plan, a canal: Panama";
   System.out.println(palindrome(0,s));
}
}
