package BS_on_2D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_a_Peak_Element2 {

    static int findMaxIndex(ArrayList<ArrayList<Integer>>mat , int n , int m , int col){
        int maxValue = -1;
        int index = -1;
        for(int i=0; i<n; i++){
            if(mat.get(i).get(col) > maxValue){
                maxValue = mat.get(i).get(col);
                index = i;
            }
        }
        return index;
    }
    
    static int[] fndPeakGrid(ArrayList<ArrayList<Integer>>mat){
            int n = mat.size();
            int m = mat.get(0).size();
            int low =0, heigh= m -1;

            while (low <= heigh) {
                int mid = (low + heigh)/2;
                int maxRowIndex = findMaxIndex(mat, n, m, mid);
                int left = mid -1 >=0 ? mat.get(maxRowIndex).get(mid -1): -1;
                int right = mid +1 < m ? mat.get(maxRowIndex).get(mid +1): -1;
                if(mat.get(maxRowIndex).get(mid) > left && mat.get(maxRowIndex).get(mid) > right){
                    return new int[]{maxRowIndex , mid};
                }
                else if(mat.get(maxRowIndex).get(mid) < left){
                    heigh = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // int mat = {{1,4},{3,2}};
         matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        int[] result = fndPeakGrid(matrix);
        System.out.println(Arrays.toString(result));
        
    }
}
