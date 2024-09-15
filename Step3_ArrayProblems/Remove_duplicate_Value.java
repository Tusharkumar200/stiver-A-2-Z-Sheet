


import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_Value {

    public static void RemoveDuplicate(int arr[]){

        Set <Integer> data = new LinkedHashSet<>();
        
        for( int i: arr){
            data.add(i);
        }

        for(int j: data){

            System.out.print(j+ " ");
            
            
        }

        
        

    }

    public static void main(String[] args) {
        
        int arr[] = {1,1,2,5,4,4,8,8,9,10,15,16,20};

        RemoveDuplicate(arr);

    }
}