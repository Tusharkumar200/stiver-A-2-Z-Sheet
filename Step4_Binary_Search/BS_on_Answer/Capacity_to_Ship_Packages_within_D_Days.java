

public class Capacity_to_Ship_Packages_within_D_Days {

    public static int findDays(int[] weights  , int capacity){
        int days = 1;
        int load =0;
        int n = weights.length;

        for(int i=0; i<n; i++){
            if(load + weights[i] > capacity){
                days +=1;
                load = weights[i];

            }
            else{
                load = weights[i];
            }
        }
        return days;
    }
    
    public static int leastWeightCapacity(int[] weights, int d) {

        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i =0; i< weights.length;i++){
            high += weights[i];
            low = Math.max(low , weights[i]);
        }
        while (low <= high) {
            int mid = (low + high) /2;
            int numOfDay = findDays(weights, mid);

            if(numOfDay <= d){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
