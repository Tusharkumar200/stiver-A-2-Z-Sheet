package BS_on_2D_Arrays;

import java.util.ArrayList;

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
    
    static int fndPeakGrid(ArrayList<ArrayList<Integer>>mat){
            int n = mat.size();
            int m = mat.get(0).size();
            int low =0, heigh= m -1;

            while (low <= heigh) {
                int mid = (low + heigh)/2;
                int maxRowIndex = findMaxIndex(mat, n, m, mid);
                int left = mid -1 >=0 ? mat.get(maxRowIndex).get(mid -1): -1;
                int right = mid +1 <0 ? mat.get(maxRowIndex).get(mid +1): -1;
                if(mat.get(maxRowIndex).get(mid) > left && mat.get(maxRowIndex).get(mid) > right){
                    return {maxRowIndex , mid};
                }
                else if(mat.get(maxRowIndex).get(mid) < left){
                    heigh = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            return {-1,-1};
    }
    public static void main(String[] args) {
        int mat = {{1,4},{3,2}};
        int
    }
}
