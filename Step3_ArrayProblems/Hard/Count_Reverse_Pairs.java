import java.util.ArrayList;

public class Count_Reverse_Pairs {
    
    // * Brute Force (O(N^2))

    public static int countPairs(int[] a, int n) {

        int count = 0;

        for(int i=0; i<n; i++){

            for(int j = i+1; j<n; j++){

                if(a[i] > 2 * a[j]) count++;
            }
        }
        return count;
    }

    public static int team(int[] skill, int n) {
        return countPairs(skill, n);
    }

    
    //* Optimal Solution
    // ? using merge sort algorithm

     private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int  countPairsOptimal(int[] a, int low, int mid, int high){
        int count = 0;
        int right = mid + 1;

        for(int i=low; i<=mid; i++){

            while(right<=high && a[i] > 2*a[right]){
                right++;
            }
            count += right - (mid + 1);
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count =0;
        if (low >= high) return count;
        int mid = (low + high) / 2 ;
        count += mergeSort(arr, low, mid);  // left half
        count += mergeSort(arr, mid + 1, high); // right half
        count += countPairsOptimal(arr, low, mid, high);  // merging sorted halves
        merge(arr, low, mid, high);  // merging sorted halves
        return count;
    }

    public static int teamOptimal(int[] skill, int n) {
         return mergeSort(skill,0, n-1);
         
    }
    public static void main(String[] args) {
        
        int[] a = {4, 1, 2, 3, 1};
        int n = 5;
        // int result = team(a, n);
        int result = teamOptimal(a, n);
        System.out.println(result);

    }
}
