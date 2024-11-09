public class Find_the_Smallest_Divisor_Given_a_Threshold {
    
    public static int sumByD(int[] arr, int div) {
        int n = arr.length;
        int sum = 0;

        for(int i=0; i< n; i++){

            sum += Math.ceil((double) arr[i]/(double) div );
        }
        return sum;
    }
    public static int smallestDivisor(int[] arr, int limit) {
        int n = arr.length;

        if(n > limit) return -1;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i< n; i++){
            maxi = Math.max(arr[i], maxi);
        }
        int low =0, high = n-1;

        while (low <= high) {
            int mid = (low + high)/2;

            if(sumByD(arr, mid) <= limit){

                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
