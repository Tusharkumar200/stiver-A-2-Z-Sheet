package Medium;

public class Count_Subarray_Sum_Equals_K {
    
// 
    public static int  countSubarray(int[] arr, int k){


        int count =0;

        for(int i =0; i<arr.length; i++){
            int sum = 0;
                for(int j = i; j< arr.length; j++){
                        sum += arr[j];

                        if(sum == k){
                            count++;
                        }
                }
        }

        return count;
    }
    public static void main(String[] args) {
        int array[] = {3, 1, 2, 4}; int k = 2;

        int res =countSubarray(array, k);
        System.out.println(res);

    }
}
