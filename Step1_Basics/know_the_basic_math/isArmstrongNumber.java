import java.lang.Math;

public class isArmstrongNumber{

    public static boolean isArmstrong(int num){

        int k = String.valueOf(num).length();
        int sum = 0;
        
        int n = num;
        while (n >0) {
            int ld = n % 10;

            sum += Math.pow(ld, k);
            n = n /10;
        }
        
        return num == sum ? true : false;
        
    }
    public static void main (String[] args){

        int number = 18;
        
         System.out.println(isArmstrong(number));
    }
}