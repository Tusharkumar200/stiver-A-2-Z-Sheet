public class Find_GCD_of_two_numbers {

    // Brute Force Approach
    public static int BruteForce_GCD(int n1, int n2){

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

        
        return gcd;
    }
    
    // Optimal Approach

    public static int Optimal_Approach_GCD(int n1, int n2){

        while(n1 > 0 && n2 > 0){

            if(n1 > n2){
                n1 = n1 % n2;
            }
            else{
                n2 = n2 % n1;
            }
        }

        if(n1 == 0) return n2;
        
        return n1;
    }
    public static void main(String[] args) {
        
        int num1=20;
        int num2=15;
        // BruteForce_GCD(num1, num2);
        int result = Optimal_Approach_GCD(num1 , num2);
        System.out.println(result);
    }
}
