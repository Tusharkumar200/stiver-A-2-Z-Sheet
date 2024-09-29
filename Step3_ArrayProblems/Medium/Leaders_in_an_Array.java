package Medium;

import java.util.ArrayList;

public class Leaders_in_an_Array {

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

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        System.out.println(printLeader(arr));
        


        // ArrayList<Integer> ans = printLeader(arr);

        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.print(ans.get(i) + " ");
        // }

    }
}
