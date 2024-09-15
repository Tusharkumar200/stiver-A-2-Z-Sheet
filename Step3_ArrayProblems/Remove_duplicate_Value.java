


import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_Value {

    public static void RemoveDuplicate(int arr[]){
        
        Set <Integer> data = new LinkedHashSet<>();
        
        data.toArray();
        for( int i: arr){
            data.add(i);
        }

        // for(int j: data){

        //     System.out.print(j+ " ");
            
            
        // }

        
        
        for(int i: data){
            System.out.print(i +" ");
        }

        System.out.println("Size " +data.size());
                
        
    }


    public static void main(String[] args) {
        
        // int arr[] = {1,1,2,5,4,4,8,8,9,10,15,16,20};
        int arr[] = {1 ,2 ,2 ,3 ,3 ,3 ,4 ,4, 5, 5 };

        RemoveDuplicate(arr);
    }

    
}