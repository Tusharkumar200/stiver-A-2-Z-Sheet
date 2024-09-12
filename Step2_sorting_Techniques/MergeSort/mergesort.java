import java.util.*;

public class mergesort {


    public static void merge(int[] arr, int low, int mid, int high){

        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1; 

        while (left <= mid && right <= high) {
            
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++; 
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }


    }

    public static void sort(int[]arr, int low , int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);

    }
    public static void printArray(int arr[]){
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {50,80,10,20,30,6,5};
        
        System.out.println("Given array is");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}
