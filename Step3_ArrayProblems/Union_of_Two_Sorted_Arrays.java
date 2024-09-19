import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Union_of_Two_Sorted_Arrays {
    
   public static List< Integer > unionArray (int []a, int []b) {


        HashSet <Integer> hs = new HashSet<>();
        ArrayList <Integer> al = new ArrayList<>();

        for(int i : a){
            hs.add(i);
        }
        for(int i : b){
            hs.add(i);
        }

        for( int j: hs){

            al.add(j);
        }

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        return al;

    }

    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,6};
        int arr2[] = {2,3,5,7};

         unionArray(arr1, arr2);

    }
}
