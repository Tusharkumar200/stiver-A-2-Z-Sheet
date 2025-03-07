public class Count_number_of_nice_subarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            nums[i] %=2;
        }
        int[] prefixCount = new int[n+1];
        prefixCount[0] =1;
        int s =0;
        int ans =0;

        for(int num:nums){
            s+=num;
            if(s >=k){
                ans += prefixCount[s-k];
            }
            prefixCount[s]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
