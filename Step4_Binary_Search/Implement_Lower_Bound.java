public class Implement_Lower_Bound {
    
    public static int lowerBound(int[]arr, int n, int x){

        for(int i=0; i<n; i++){

            if(arr[i] > x)return i;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
