public class Maximum_Points_You_Can_Obtain_from_Cards {
    
    public int maxScore(int[] nums, int k) {
        int lsum=0 , rsum=0, maxSum=0;
        int n = nums.length;
        for(int i=0; i< k-1; i++){
            lsum = lsum + nums[i];
            maxSum = lsum;
        }
        int rightIndx = n-1;
        for(int i = k-1 ; i>=0;i--){
            lsum = lsum - nums[i];
            rsum = rsum + nums[rightIndx];
            rightIndx = rightIndx-1;

            maxSum = Math.max(maxSum , lsum + rsum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        
    }
}
