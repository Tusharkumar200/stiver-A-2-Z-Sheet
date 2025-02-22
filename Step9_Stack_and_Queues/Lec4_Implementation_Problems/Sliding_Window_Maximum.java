import java.util.ArrayList;

public class Sliding_Window_Maximum {
    
    //BruteForce Solution
     static ArrayList < Integer > MaxSlidingWindow(int arr[], int k) {

     }

    // optimal solution
    public static int[] maxSlidingWindow(int[] a, int k) {

    }

    
    public static void main(String[] args) {
        int i, j, n, k = 3, x;
        int arr[]={4,0,-1,3,5,3,6,8};
        int ans[] = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");
    }
}
