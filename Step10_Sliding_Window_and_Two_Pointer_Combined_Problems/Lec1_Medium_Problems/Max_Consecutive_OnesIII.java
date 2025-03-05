

public class Max_Consecutive_OnesIII {
    
    public int longestOnes(int[] nums, int k) {
        int n = nums.length-1;
        int l=0,r=0,zero=0,maxlen=0;

        while(r<n){
            if(nums[n]==0)zero--;
            if(zero > k){
                if(nums[l]==0){
                    zero--;
                    l++;
                }

            }
            r++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        
    }
}
