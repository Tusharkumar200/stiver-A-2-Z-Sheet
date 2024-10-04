package Medium;

public class Rotate_Image_by_90_degree {

    public static void rotate(int arr[][]){

        int n = arr.length;

        int rotated[][]  = new int[n][n];
        for(i: arr){

            for(int j: arr){

                rotated[j][n-i-1] = i j;
            }
        }
    }
    
    public static void main(String[] args) {
        
        int arr [][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        
    }
}
