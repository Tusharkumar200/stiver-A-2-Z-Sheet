

import java.util.HashMap;
class Length_of_the_longest_subarray_with_zero_Sum{

// Bruteforce approach
    public static int findLengthOfLongestSubarrayWithZeroSum(int[]arr){

        int n = arr.length;
        int max = 0;

        for(int i=0; i<n; i++){
            
            int sum = 0;
            for(int j =i; j<n ; j++){
                sum += arr[j];

                if(sum == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }

        return max;
    }
    
   
// Optimal approach   
    public static int optimalSolution(int[] arr){
        
        int n = arr.length;
        int max = 0;
        int sum =0;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        for(int i=0; i<n; i++){
            sum +=arr[i];

            if(sum == 0){
                max = i+1;
            }
            else{
                if(mpp.containsKey(sum)){
                    max = Math.max(max, i-mpp.get(sum));
                }
                else{
                    mpp.put(sum, i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        // Bruteforce approach
        System.out.println("Length of the longest subarray with zero sum is: " + findLengthOfLongestSubarrayWithZeroSum(arr));
        // Optimal approach
        System.out.println("Optimal Approach longest subarray with zero sum is: " + optimalSolution(arr));
    }
}