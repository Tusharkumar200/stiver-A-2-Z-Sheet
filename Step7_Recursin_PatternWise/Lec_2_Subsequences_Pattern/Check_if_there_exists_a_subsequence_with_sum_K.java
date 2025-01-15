package Lec_2_Subsequences_Pattern;

public class Check_if_there_exists_a_subsequence_with_sum_K {
    
    public static boolean isSubsetPresent(int n, int sum,int []arr) {
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true; 
        }
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = false; // Non-zero sum is not possible with no elements
        }
        
        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // Exclude the current element
                dp[i][j] = dp[i - 1][j];
                
                // Include the current element (if it does not exceed the current sum)
                if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        
        // The result is in dp[n][sum]
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        if (isSubsetPresent(n, sum, arr)) {
            System.out.println("Found a subset with given sum");
        } else {
            System.out.println("No subset with given sum");
        }
    }
}
