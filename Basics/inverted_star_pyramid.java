

/*
Input Format: N = 3
Result: 
*****  
 ***
  *   

 */

public class inverted_star_pyramid {
    
        public static void printinvertStar(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * n) - 1 - (2 * i); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    
    public static void main(String[] args) {
        int N = 2;
        printinvertStar(N);
    }
}