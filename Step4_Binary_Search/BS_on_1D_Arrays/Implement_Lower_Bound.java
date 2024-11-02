package BS_on_1D_Arrays;
public class Implement_Lower_Bound {
    
    public static int lowerBound(int[]arr, int n, int x){
        // * Linear Search
        for(int i=0; i<n; i++){

            if(arr[i] > x)return i;
        }
        return n;
    }
    
    // * Binary Search
    public static int lowerBound_binary_search(int[]arr, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){

            int mid = (low + high)/2;
            if(arr[mid] <= x){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        // int ind = lowerBound(arr, n, x);
        int ind = lowerBound_binary_search(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
