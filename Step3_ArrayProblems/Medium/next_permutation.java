package Medium;

import java.util.Arrays;

class next_permutation{
    public static void nextPermutation(int[] nums){
         int idx = -1;

        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            Arrays.sort(nums);
        }else{
            for(int i=nums.length-1; i>idx; i--){
                if(nums[i] > nums[idx]){
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }

            int l = idx+1;
            int r = nums.length-1;

            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        // nextPermutation(nums);
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }
}