// leetcode p.No - 07

/*
 Input: x = 123
    Output: 321
 */

public class Reverse_Integer {
    
    public static int reverse(int n){
        int nums=0;

        while(n >0){
            int lastDigit = n % 10;

            // if(nums <Integer.MIN_VALUE /10 || nums > Integer.MAX_VALUE/10){

                nums = (nums*10) + lastDigit;
                n = n/10;
            // }
            
            
        }
        return nums;
    }
    public static void main(String[] args) {
        int num = -123;
        
        int result = reverse(num);
        System.out.println(result);
        // System.out.println(123 % 10);
    }
}
