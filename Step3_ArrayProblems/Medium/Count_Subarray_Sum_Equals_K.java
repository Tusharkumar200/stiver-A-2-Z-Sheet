package Medium;


import java.util.HashMap;

public class Count_Subarray_Sum_Equals_K {
    
// Better Approched!

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
    
    // optimal solution 
    public static int  SubArraySum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int preSum = 0;
        int cnt = 0;

        for(int i: arr){
            preSum += i;
            int remove = preSum -k;
            cnt += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int array[] = {3, 1, 2, 4}; int k = 3;

        // int res =countSubarray(array, k);
        int res =SubArraySum(array, k);
        System.out.println(res);

    }
}
