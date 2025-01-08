
public class Count_Good_Numbers{
    
    private long MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) {
        
        long even = (n + 1)/2;
        long odd = (n/2);

        long first = pow(5 , even)%MOD;
        long second = pow(4 , odd)%MOD;

        return (int) ((first * second)%MOD);
    }

    
    public static void main(String[] args) {
        
    }
}