package Easy;
import java.util.Arrays;

class Find_the_Largest_element_in_an_array{

    public static int largest2(int[] arr) {
        
        int max = arr[0];
        for(int i: arr){
            
            if( i > max){
                max = i;
            }
        }
        return max;
        
    }

    public static void largest(int arr[]){
        
        int last = arr[arr. length - 1];
        
        System.out.println("last element "+last);
        
    }
    public static void main(String[] args) {
        
        int arr[]= {8,4,1};
        Arrays.sort(arr);
        largest(arr);
    }
}