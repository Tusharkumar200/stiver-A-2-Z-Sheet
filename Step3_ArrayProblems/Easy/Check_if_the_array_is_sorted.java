package Easy;

import java.util.Arrays;

public class Check_if_the_array_is_sorted {
    
    public static boolean isSorted(int arr[]){

        int save[] = arr.clone();
        Arrays.sort(save);
        boolean check = Arrays.equals(save, arr);
        
        
        if(check){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        // int sort[] = {10,20,30,40,50};
        int unsort[] = {5,4,21,8,6,3,0};

        boolean result = isSorted(unsort);
        // boolean result = isSorted(sort);
        System.out.println(result);
    }
}
