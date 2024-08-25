/*

 Input Format: N = 3
 Result: 

  A  
 ABA 
ABCBA

*/

public class Alpha_Hill_Pattern {
    
    public static void alpha_hill(int n){

       
        for (int i = 0; i < n; i++) {

            // printing leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // printing the characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(ch + " ");

                if (j < breakpoint) ch++;
                else ch--;
            }

            // move to the next line
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        int n=5;
        alpha_hill(n);
    }
}
