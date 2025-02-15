import java.util.Stack;

public class Sum_of_subarray_minimum {

     public int sumSubarrayMins(int[] arr) {
         Stack<int[]> stack = new Stack<>();
        int[] res = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            // use ">=" to deal with duplicate elements
            while (!stack.isEmpty() && stack.peek()[0] >= arr[i]) {
                stack.pop();
            }

            int j = stack.isEmpty() ? -1 : stack.peek()[1];
            res[i] = stack.isEmpty() ? arr[i] * (i + 1) : res[j] + arr[i] * (i - j);
            stack.push(new int[]{arr[i], i});
        }

        long MOD = (long) 1000000007;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = (ans + (long) res[i]) % MOD;
        }
        return (int) ans;     
    }
    public static void main(String[] args) {
        Sum_of_subarray_minimum solution = new Sum_of_subarray_minimum();
        int[] arr = {3, 1, 2, 4};
        int result = solution.sumSubarrayMins(arr);
        System.out.println("Sum of subarray minimums: " + result);
    }
}
