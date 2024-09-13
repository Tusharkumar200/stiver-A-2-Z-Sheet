import java.util.Arrays;

class Find_the_Largest_element_in_an_array{

    public static void largest(int arr[]){
        
        int last = arr[arr. length - 1];
        for (int i : arr) {
            System.out.print( i + " ");
        }
        System.out.println("last element "+last);
        
    }
    public static void main(String[] args) {
        
        int arr[]= {50,80,10,2,88,6,7,15,4,8,16,20,100,158};
        Arrays.sort(arr);
        largest(arr);
    }
}