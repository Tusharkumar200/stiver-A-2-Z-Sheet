public class Kth_Missing_Positive_Number {
    

    public static int missingK(int arr[], int n, int k){
        //* Linear Search
        for(int i: arr){
            if(i <= k) k++;
            else break;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
