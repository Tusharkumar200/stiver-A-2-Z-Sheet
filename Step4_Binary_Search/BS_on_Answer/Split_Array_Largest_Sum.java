package BS_on_Answer;

public class Split_Array_Largest_Sum {

    public static int countPartitions(int[] a, int maxSum) {

        int n = a.length;
        int partitions = 1;
        long subarraysSum =0;

        for(int i=0; i < n; i++){

            if(subarraysSum +a[i] <= maxSum){

                subarraysSum += a[i];
            }
            else{
                partitions++;
                subarraysSum = a[i];
            }
        }
        return partitions;

    }
    
    public static int largestSubarraySumMinimized(int[] a, int k) {

        return 0;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}
