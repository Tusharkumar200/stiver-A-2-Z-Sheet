/*
 Input:N =12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12. 
 
 */
public class Sum_of_all_divisors_from_1_to_n {

    // Function to calculate the sum of all divisors of a number
    public static int sumOfDivisors(int num) {
        int sum = 0;
        // Iterate from 1 to the square root of num
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {  // If i is a divisor of num
                sum += i;
                if (i != num / i) {  // If i and num/i are different
                    sum += num / i;
                }
            }
        }
        return sum;
    }

    // Function to calculate the sum of sum of divisors for all numbers from 1 to N
    public static int sumOfAllDivisors(int N) {
        int totalSum = 0;
        for (int i = 1; i <= N; i++) {
            totalSum += sumOfDivisors(i);
        }
        return totalSum;
    }

    public static void main(String[] args) {
        // Example input
        int N = 4;
        int result = sumOfAllDivisors(N);
        System.out.println(result);  // Output should be 15
    }
}
