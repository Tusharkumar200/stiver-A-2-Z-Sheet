public class Number_Crown_Pattern {
    
    public static void printNumberCrown(int n){


        int maxWidth = 2 * n - 1;  // Maximum width of the pattern

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces
            int spaces = maxWidth - 2 * i;  // Adjust spaces based on the current row
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printNumberCrown(n);
    }
}


