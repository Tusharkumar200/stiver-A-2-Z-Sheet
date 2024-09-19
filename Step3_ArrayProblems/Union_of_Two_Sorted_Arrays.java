import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Union_of_Two_Sorted_Arrays {

    public static List<Integer> unionArray(int[] a, int[] b) {

        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i : a) {
            hs.add(i);
        }
        for (int i : b) {
            hs.add(i);
        }

        for (int j : hs) {

            al.add(j);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        return al;

    }


    // Optimize Solution 
    
    public static List<Integer> Union2(int[] arr1, int[] arr2) {

        int i = 0, j = 0; // pointers
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } 
            else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        for(int k: Union){
            System.out.print(k +" ");
        }
        return Union;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 6 };
        int arr2[] = { 2, 3, 5, 7 };

        // unionArray(arr1, arr2);
        Union2(arr1, arr2);

    }
}
