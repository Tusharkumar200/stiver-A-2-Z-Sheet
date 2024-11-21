public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of elements in the Fibonacci series
        int[] fib = new int[n];
        
        // Initialize the first two elements
        fib[0] = 0;
        fib[1] = 1;
        
        // Calculate the Fibonacci series up to the nth element
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        // Print the Fibonacci series
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
