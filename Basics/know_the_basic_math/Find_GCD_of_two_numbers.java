public class Find_GCD_of_two_numbers {

    public static void GCD(int n1, int n2){

        //  n1 = 9 , n2 = 12

        int gcd = 1;

        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }

        System.out.println(gcd);
        // return 0;
    }
    
    public static void main(String[] args) {
        
        int num1=9;
        int num2=12;
        GCD(num1, num2);
    }
}
