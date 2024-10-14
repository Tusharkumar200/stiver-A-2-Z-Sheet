

public class Count_the_number_of_subarrays_with_given_xor_K{


    // Better Approach
    public static int subarraysWithXorK(int []arr,int  k){
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            int xorr = 0;

            for(int j=i; j<n;j++){

                xorr= xorr ^ arr[j];
                if(xorr ==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}