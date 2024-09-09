
/*
 Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1
 */

public class Factorial_of_Number {

    public static int fact(int num){

        if(num == 0 || num== 1) return 1;

        int factNo = num * fact(num-1);

        System.out.println(factNo);

        return factNo;
    }
    
    public static void main(String[] args) {
        int num = 5;
        System.out.println( fact(num));
    }
}
