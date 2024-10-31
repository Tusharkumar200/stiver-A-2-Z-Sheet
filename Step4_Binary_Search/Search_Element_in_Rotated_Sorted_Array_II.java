public class Search_Element_in_Rotated_Sorted_Array_II {
    
    public static boolean searchInARotatedSortedArrayII(int []arr, int k){

        for(int i: arr){
            if(i == k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6}, k = 3;
        boolean res =  searchInARotatedSortedArrayII(arr,  k);
        System.out.println(res);
    }
}
