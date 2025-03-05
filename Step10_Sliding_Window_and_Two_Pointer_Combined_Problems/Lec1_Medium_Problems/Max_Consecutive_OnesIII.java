

public class Max_Consecutive_OnesIII {
    
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l=0,zero=0,maxlen=0;

        for(int r=0; r<n; r++){
            if(nums[r] ==0){zero++;}

            while(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            maxlen = Math.max(maxlen , r-l+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Max_Consecutive_OnesIII solution = new Max_Consecutive_OnesIII();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = solution.longestOnes(nums, k);
        System.out.println("The maximum number of consecutive 1s is: " + result);
    }
}
