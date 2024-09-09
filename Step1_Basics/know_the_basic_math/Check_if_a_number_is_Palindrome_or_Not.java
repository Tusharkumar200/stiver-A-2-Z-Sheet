public class Check_if_a_number_is_Palindrome_or_Not {
    
    public static boolean isPalindrome(int n){
        //  12321
        
        int dup = n;

        
        int revNo= 0;
        while(n>0){
            
            int ld  = n % 10;
            revNo = (revNo * 10) + ld;

            n = n/10;
        }

        if(dup == revNo){
            return true;
        }

        return false;
        
    }
    public static void main(String[] args) {
        int n = 12321;
        boolean result = isPalindrome(n);
        System.err.println("the given no is :"+ result);
    }
}
