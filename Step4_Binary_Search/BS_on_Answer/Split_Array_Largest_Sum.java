package BS_on_Answer;

//* problem book allocation and Painter's Partion is base on same concept.

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
        int low = a[0];
        int high = 0;

        for(int i=0; i< a.length; i++){
            low = Math.max(low, a[i]);
            high +=a[i];
        }

        while(low <= high){
            int mid = (low + high)/2;
            int partitions = countPartitions(a, mid);
            if(partitions > k ){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}
