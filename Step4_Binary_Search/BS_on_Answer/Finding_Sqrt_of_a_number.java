package BS_on_Answer;

// import java.util.*;

public class Finding_Sqrt_of_a_number {
    
    public static int floorSqrt(int n) {

        // * using Build-in function.
        // int ans;

        // ans = (int)Math.sqrt(n);
        // return ans;

        //* using Linear Search
        /*
            int ans=0;
            for(long i=1; i<=n; i++){
                long val = i * i;

                if(val <= (long) n){ans = (int) i;}
                else break;
            }
            return ans;
        */

        // * Binary Search
        int low =1, high = n;

        while(low <= high){
            long mid = (low + high)/2;
            long val = mid * mid;
            if (val <= (long)(n)){
                low = (int) (mid +1);
            }
            else {
                high = (int) (mid -1);
            }
        }
        return high;
    }
    public static void main(String[] args) {
         int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
