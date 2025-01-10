package Lec_1_Get_A_Strong_Hold;

public class Count_Good_Numbers{
    
    private static long MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        
        long even = (n + 1)/2;
        long odd = (n/2);

        long first = pow(5 , even)%MOD;
        long second = pow(4 , odd)%MOD;

        return (int) ((first * second)%MOD);
    }

    private static  long pow(long x, long n){
        if(n == 0)return 1;

        long temp = pow(x,n/2);

        if(n % 2 == 0){
            return (temp * temp)%MOD;
        }
        else{
            return (x * temp * temp)%MOD;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(12345));
    }
}