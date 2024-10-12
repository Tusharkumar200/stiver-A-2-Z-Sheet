import java.util.List;

public class _3_Sum{

    public static List<List<Integer>> triplet(int n, int[] arr){
        
    }

    public static void main(String[] args) { int[] arr = { -1, 0, 1, 2, -1, -4};
    int n = arr.length;
    List<List<Integer>> ans = triplet(n, arr);
    for (List<Integer> it : ans) {
        System.out.print("[");
        for (Integer i : it) {
            System.out.print(i + " ");
        }
        System.out.print("] ");
    }
    System.out.println();
    }
}