import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Sliding_Window_Maximum {
    
    //BruteForce Solution
    static void GetMax(int arr[], int l, int r, ArrayList < Integer > maxx) {
        int i, maxi = Integer.MIN_VALUE;
        for (i = l; i <= r; i++)
            maxi = Math.max(maxi, arr[i]);
        maxx.add(maxi);
    }

     static ArrayList < Integer > MaxSlidingWindow(int arr[], int k) {
        int left = 0, right = 0;
       
        ArrayList < Integer > maxx = new ArrayList < > ();

        while(right < k-1){
            right++;
        }

        while(right < arr.length){
            GetMax(arr, left, right, maxx);
            left++;
            right++;
        }
        return maxx;
     }

    // optimal solution
    public static int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
       
        Deque < Integer > q = new ArrayDeque < > ();
        
        for(int i=0; i<a.length; i++){
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }

            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }

        return r;
    }


    public static void main(String[] args) {
        int i, k = 3;
        int arr[]={4,0,-1,3,5,3,6,8};
        int ans[] = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");
    }
}
