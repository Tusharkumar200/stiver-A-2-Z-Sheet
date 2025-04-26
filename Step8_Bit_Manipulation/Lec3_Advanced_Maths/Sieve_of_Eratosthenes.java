package Step8_Bit_Manipulation.Lec3_Advanced_Maths;

import java.util.Arrays;

public class Sieve_of_Eratosthenes {
    
    public int countPrimes(int n) {
         if (n <= 2) return 0;
        
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                // Use long to avoid overflow for i*i for large values of i.
                for (long j = (long) i * i; j < n; j += i) {
                    isPrime[(int) j] = false;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
