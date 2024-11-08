public class Koko_Eating_Bananas {
    
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;
        int n = v.length;

        for(int i=0; i<n ; i++){
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] v, int hourly) {
        
    }
    public static int minimumRateToEatBananas(int[] v, int h) {
        
        return 0;
    }
    public static void main(String[] args) {
        
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
