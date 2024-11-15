package BS_on_Answer;

import java.util.Arrays;

public class Aggressive_Cows {
    public static boolean canWePlace(int[] stalls, int dist, int cows) {

        int n = stalls.length;
        int cntCow = 1;
        int last = stalls[0];

        for(int i=1; i<n; i++){

            if(stalls[i] - last >= dist){
                cntCow++;
                last =stalls[i];
            }
            if(cntCow >= cows)return true;
        }

        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[n-1] - stalls[0];

        while(low <= high){
            int mid = (low + high)/2;

            if(canWePlace(stalls, mid, k) == true){
                low = mid + 1;

            }else{
                high = mid -1;
            }
        }


        return high;
    }
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
