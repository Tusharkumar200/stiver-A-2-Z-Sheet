import java.util.ArrayList;

public class Move_all_Zeros_to_the_end_of_the_array {
    
    public static void MoveZero(int arr[]){
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i =0; i< n; i++){

            if(arr[i] !=0){
                temp.add(arr[i]);
            }
        }

        int tempLength = temp.size();

        // System.out.println(tempLength);

        int nz = n - tempLength;

        for(int i =0 ; i< nz ; i++){

            temp.add(0);
            
        }
        
        for (int i : temp) {
            System.out.println(i);
        }
        
        
    }
    public static void main(String[] args) {
        
        int arr[] = {0,1,0,3,12};
        MoveZero(arr);

        
    }
}
