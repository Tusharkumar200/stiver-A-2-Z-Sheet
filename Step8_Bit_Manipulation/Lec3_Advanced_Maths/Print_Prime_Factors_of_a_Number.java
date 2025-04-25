package Step8_Bit_Manipulation.Lec3_Advanced_Maths;

public class Print_Prime_Factors_of_a_Number {
    
    public static void printPrimeFactors(int n){
         while (n % 2 == 0) {

            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {

          
            while (n % i == 0) {

                System.out.print(i + " ");
                n /= i;
            }
        }

         if (n > 2)
            System.out.print(n);
    }
    public static void main(String[] args) {
         int n = 315;
        printPrimeFactors(n)
    }
}
