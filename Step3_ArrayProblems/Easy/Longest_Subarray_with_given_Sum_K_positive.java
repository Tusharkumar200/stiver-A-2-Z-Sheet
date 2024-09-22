/*
Example 1:
    Input Format: N = 3, k = 5, array[] = {2,3,5}
    Result: 2
    Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
    Result: 3
    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

 */

import java.util.HashMap;

class Longest_Subarray_with_given_Sum_K_positive{

    public static int Longest_Subarray(int []arr , int k){
        
         HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int currentsum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];

            if (currentsum == k) {
                maxlen = i + 1;
            }

            if (map.containsKey(currentsum - k)) {
                maxlen = Math.max(maxlen, i - map.get(currentsum - k));
            }

            if (!map.containsKey(currentsum)) {
                map.put(currentsum, i);
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,3,5,1,9};
        int k = 10;
        int result = Longest_Subarray(arr , k);

        System.out.println(result);

    }
}