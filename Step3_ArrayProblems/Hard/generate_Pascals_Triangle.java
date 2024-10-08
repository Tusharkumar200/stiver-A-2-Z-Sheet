package Hard;

import java.util.List;

public class generate_Pascals_Triangle {

    public List<List<Integer>> pascalsTriangle(int numRows) {
        
    }
    
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
