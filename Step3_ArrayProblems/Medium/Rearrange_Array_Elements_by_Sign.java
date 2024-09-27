package Medium;

public class Rearrange_Array_Elements_by_Sign{

    public static int[] reArrange(int[]arr){
        int n = arr.length/2;

        int pos[] = new int[n];
        int neg[] = new int[n];
        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] >= 0){
                pos[posIndex++] = arr[i];
            }
            else{
                neg[negIndex++] = arr[i];
            }
        }

        

        for (int i = 0; i < n ; i++) {
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
        return arr;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, -3, -1, -2, 3};
        int res[] = reArrange(arr);
        for (int i : res) {
            
            System.out.print(i+" ");
        }
    }
} 