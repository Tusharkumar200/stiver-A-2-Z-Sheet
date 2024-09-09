/*

Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

*/


public class FibonacciNumber {
    
    public static int fib(int n){
        if(n <= 1) return n;


        int first = fib(n-1);
        int second = fib(n-2);
        

        int sum = first + second;
        // System.out.print(sum +" ");
        return sum;
    }
    public static void main(String[] args) {
        
        int n = 8;
        System.out.println(fib(n));
    }
}
