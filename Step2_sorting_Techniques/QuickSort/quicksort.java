package Step2_sorting_Techniques.QuickSort;

public class quicksort{

    static void swap(int arr[], int i , int j){
        
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }

    static void quick(int arr[], int low, int high){
        if (low < high) {

            int pi = partition(arr, low, high);

            quick(arr, low, pi - 1);
            quick(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];

        
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    } 

    
    public static void printArray(int arr[]){
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        
        quick(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}