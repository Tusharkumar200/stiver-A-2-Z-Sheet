package Medium;


/*
Input:
 arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output:
 6 

Explanation:
 [4,-1,2,1] has the largest sum = 6. 

 */
public class MaximumSubarraySumI_in_an_Array {
    
    
    public static int maxSubArray(int[] arr){

        int sum = 0;
        int maxi = arr[0];

        for(int i : arr){
            sum += i;

            if(sum > maxi) {maxi = sum;}
            if(sum < 0) {sum  = 0;}
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr []= {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(arr);

        System.out.println(result);
    }
}
