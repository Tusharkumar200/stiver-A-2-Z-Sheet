package Easy;

public class Find_the_missing_number_in_an_array {
    
    public static int  missingNumber(int a[] ){
        int N = a.length;

        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5 };
        
        // int res = missingNumber(arr);
         int res = missingNumber(arr);
        
            System.out.println(res);
        
    }
}
