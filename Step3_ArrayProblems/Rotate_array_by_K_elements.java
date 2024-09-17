/*
 * Input: nums = [1,2,3,4,5,6,7], k = 3
  * Output: [5,6,7,1,2,3,4]
  * Explanation:
  * rotate 1 steps to the right: [7,1,2,3,4,5,6]
  * rotate 2 steps to the right: [6,7,1,2,3,4,5]
  * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class Rotate_array_by_K_elements {


    public static void reverse(int [] array , int start , int end){

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateByK(int arr[], int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return;
        }
        int n = arr.length;
        k = k % n;
        reverse(arr,0 ,n-1);
        reverse(arr, 0, k-1);
        reverse(arr,k,n-1);

         
        Move_all_Zeros_to_the_end_of_the_array
    }

    public static void main(String[] args) {

        int arr[] = {  1, 2, 3, 4, 5 ,6,7};
        
        int k = 3;
        rotateByK(arr, k);


        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
        }
    }
}
