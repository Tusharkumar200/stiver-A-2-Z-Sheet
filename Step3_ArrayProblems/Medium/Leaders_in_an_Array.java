package Medium;

import java.util.ArrayList;

public class Leaders_in_an_Array {

    // BruteForce Approched 
    public static ArrayList<Integer> printLeader(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++)
                if (arr[j] > arr[i]) {

                    leader = false;
                    break;
                }

            // Push all the leaders in ans array.
            if (leader)
                ans.add(arr[i]);

        }

        return ans;
    }

    
    public static ArrayList<Integer> optimalPring(int[] arr , int n){
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = arr[n-1];
        ans.add(max);

        for(int i= n-1 ; i>=0 ; i--){
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
              }
        }

        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;
        
        // System.out.println(printLeader(arr));
        System.out.println(optimalPring(arr,n));
        


    }
}
