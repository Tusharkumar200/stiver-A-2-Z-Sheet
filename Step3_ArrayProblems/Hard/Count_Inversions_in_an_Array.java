public class Count_Inversions_in_an_Array {
    
    // Brute Force 

    public static int numberOfInversions(int[] arr, int n){
        int count =0;

        for(int i=0; i<n; i++){

            for(int j = i+1; j<n; j++){
                if(arr[i] > arr[j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions is: " + cnt);
    }
}
