public class Minimise_Maximum_Distance_between_Gas_Stations {
    
    public static int numberOfGasStationsRequired(double dist, int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i=1; i< n; i++){
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);

            if( (arr[i] - arr[i -1]) == (dist * numberInBetween)){
                numberInBetween--;
            }
            count += numberInBetween;
        }
        return count;
    }
    public static double minimiseMaxDistance(int[] arr, int k) {

        return 2.2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        double ans = minimiseMaxDistance(arr, k);
        System.out.println("The answer is: " + ans);
    }
}
