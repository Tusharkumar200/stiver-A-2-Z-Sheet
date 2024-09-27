package Easy;

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

        // int tempLength = temp.size();


        // int nz = n - tempLength;
        int nz = temp.size();

        for(int i =0 ; i< nz ; i++){

            // temp.add(0);
            arr[i] = temp.get(i);
            
        }

        for(int i = nz; i < n; i++){
            arr[i] = 0;
        }
        
        for (int i : arr) {
            System.out.println(i);
        }
        
        
    }
    public static void main(String[] args) {
        
        int arr[] = {0,1,0,3,12};
        MoveZero(arr);

        
    }
}
