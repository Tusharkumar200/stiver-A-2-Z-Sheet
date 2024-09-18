public class Find_the_missing_number_in_an_array {
    
    public static void missingNumber(int arr[] ){
        int n = arr.length;
        int i;
        for(i = 0; i< n -1; i++){
            System.out.println(arr[i]);

        }
        if( i != arr[i]){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        
        missingNumber(arr);
    }
}
