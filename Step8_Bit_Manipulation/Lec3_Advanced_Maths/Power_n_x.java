package Step8_Bit_Manipulation.Lec3_Advanced_Maths;

public class Power_n_x {
    public double myPow(double x, int n) {

        double ans=1;
        long m = Math.abs((long)n); // Use long to handle edge cases like Integer.MIN_VALUE

        while (m > 0) {
            if (m % 2 == 1) {
                ans *= x;
                m = m - 1;
            } else {
                m /= 2;
                x *= x;
            }
        }

        return n < 0 ? 1 / ans : ans; // Handle negative powers
    }
    public static void main(String[] args) {
        
    }
}
