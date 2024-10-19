import java.util.*;

public class Merge_two_Sorted_Arrays_Without_Extra_Space {
    
    // * BruteForce Approched
    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int left = n-1;
        int right = 0; 

        while(left >= 0 && right < m){

            if(arr1[left] > arr2[right]){

                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else break;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }

    // swap method
    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
    // Approach : Two Pointer
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
       int j = n - 1;
       int k = m + n - 1;
       
       while (j >= 0) {
           if (i >= 0 && nums1[i] > nums2[j]) {
               nums1[k--] = nums1[i--];
           } else {
               nums1[k--] = nums2[j--];
           }
       }
   }
    // GAP Method
    public static void merge_optimal(long[] arr1, long[] arr2, int n, int m) {

        int len = n + m;
        int gap = (len/2) + (len % 2);

        while (gap > 0) {
            int left =0;
            int right = left + gap;
            while (right < len) {
                
                if(left < n && right >=n){
                    swapIfGreater(arr1, arr2, left, right-n);
                }
                else if(left >= n){
                    swapIfGreater(arr1, arr2, left -n ,right- n);
                }
                else{
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap = (gap /2) + (gap % 2);
        }
    }


    public static void main(String[] args){

        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        // merge(arr1, arr2, n, m);
        merge_optimal(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
