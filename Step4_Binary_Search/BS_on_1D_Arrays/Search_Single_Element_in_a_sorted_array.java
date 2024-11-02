package BS_on_1D_Arrays;
public class Search_Single_Element_in_a_sorted_array {
    

    public static int singleNonDuplicate(int arr[]){
        // int n = arr.length;
        int ans = 0;

        for(int i: arr){
            ans  = ans ^ i;
        }
        return ans;
    }
    public static void main(String[] args) {
       int  arr[] = {1,1,2,2,3,3,4,5,5,6,6};
       int result = singleNonDuplicate(arr);
       System.out.println(result);
    }
}
