/*
 * Input: nums = [1,2,3,4,5,6,7], k = 3
  * Output: [5,6,7,1,2,3,4]
  * Explanation:
  * rotate 1 steps to the right: [7,1,2,3,4,5,6]
  * rotate 2 steps to the right: [6,7,1,2,3,4,5]
  * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class Rotate_array_by_K_elements {


    public static void reverse(int [] arr , int start , int end){

            while (start <= end) {
                int temp = arr[start];

                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
    }

    public static void rotateByK(int arr[], int n, int k) {

        reverse(arr, 0, k-1);
        reverse(arr, k,n-1);
        reverse(arr,0,n-1);

         
        
    }

    public static void main(String[] args) {

        int arr[] = {  1, 2, 3, 4, 5 ,6,7};
        int size = arr.length;
        int k = 3;
        rotateByK(arr, size, k);


        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
        }
    }
}
