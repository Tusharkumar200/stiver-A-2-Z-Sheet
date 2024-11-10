import java.util.ArrayList;

public class K_th_Element_of_two_sorted_arrays {
    
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {

        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
                    a.add(2); a.add(3); a.add(6); a.add(7); a.add(9);
            
                    ArrayList<Integer> b = new ArrayList<>();
                    b.add(1); b.add(4); b.add(8); b.add(10);
            
                    System.out.println("The k-th element of two sorted arrays is: " +kthElement(a, b, a.size(), b.size(), 5));
    }
    
}
