
import java.util.ArrayList;
import java.util.List;

public class generate_Pascals_Triangle {

    public static List<Integer> generateRow(int row){

        long ans = 1; 
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col =1; col<row; col++){
            ans = ans*(row - col);
            ans = ans/col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
    public static List<List<Integer>> pascalsTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int row =1; row<=numRows; row++){
            ans.add(generateRow(row));
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalsTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
