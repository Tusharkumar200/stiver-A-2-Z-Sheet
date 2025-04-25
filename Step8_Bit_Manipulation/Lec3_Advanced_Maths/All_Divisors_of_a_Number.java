package Step8_Bit_Manipulation.Lec3_Advanced_Maths;

import java.util.ArrayList;

public class All_Divisors_of_a_Number {

    public static void print_divisors(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);

                if (n % i != i) {
                    arr.add(n / i);
                }
                }
            }

            arr.sort(Integer::compareTo);
            for (int divisor : arr) {
                System.out.print(divisor + " ");
            }
        }

    

    public static void main(String[] args) {
        print_divisors(36);
    }
}
