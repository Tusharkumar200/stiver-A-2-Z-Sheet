public class Max_Consecutive_Ones {

    static int findMaxConsecutiveOnes(int nums[]) { 

        int count = 0;
        int maxCount = 0;

        for(int i : nums){

            if(i == 1){
                count++;
            }
            else{
                count = 0;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;

    }
        public static void main(String[] args) {
        
        int price[] = {1,1,0,1,1,1,0,1,1,1};

        int result = findMaxConsecutiveOnes(price);
        System.out.println(result +" ");

        }
}
