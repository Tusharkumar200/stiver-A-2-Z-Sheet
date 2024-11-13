public class Minimum_days_to_make_M_bouquets {
    
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length;
        int cnt =0;
        int nOfB =0;
        for(int i=0; i<n; i++){
            if(arr[i] <= day) cnt++;
            else {
                nOfB = cnt/k;
                cnt = 0;
            }

        }
        nOfB  =cnt/k;
        return noOfB >= m;  
    }
    public static int roseGarden(int[] arr, int k, int m) {
        
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    
    }
}
