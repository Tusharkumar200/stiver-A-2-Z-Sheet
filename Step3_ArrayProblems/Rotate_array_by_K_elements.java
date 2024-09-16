/*
 * Input: nums = [1,2,3,4,5,6,7], k = 3
  * Output: [5,6,7,1,2,3,4]
  * Explanation:
  * rotate 1 steps to the right: [7,1,2,3,4,5,6]
  * rotate 2 steps to the right: [6,7,1,2,3,4,5]
  * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class Rotate_array_by_K_elements {

    public static void rotateByK(int arr[], int n, int d) {

        // int position = n - d;
         d = d % n;
        int temp[] = new int[d];

        // Printing the array

        // for (int i = 0; i < size; i++) {
        //     System.out.print(arr[i] + " ");
        // }


        for(int i = 0; i< d; i++){
            temp[i] = arr[i];
        }

        // shifting  the array

        for (int j = d; j < n; j++) {
            arr[j -d] = arr[j];
        }

        //  put back temp

        for(int i = n-d ; i< n ; i++){
            arr[i] = temp[i -(n - d)];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 7, 1, 2, 3, 4, 5 };
        int size = arr.length;
        int k = 3;
        rotateByK(arr, size, k);


        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
        }
    }
}
