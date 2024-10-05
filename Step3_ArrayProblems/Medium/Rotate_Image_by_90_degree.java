package Medium;

public class Rotate_Image_by_90_degree {

    // BruteForce Approched
    public static int[][] rotate(int matrix[][]){

        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }
    
    // Optimal Approched

    public static void optimal_rotate(int[][] matrix){
        

       


        for(int i=0; i<matrix.length; i++){

            for(int j= i+1; j<matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse 
       

        for(int i=0; i<matrix.length; i++){
            reverse(matrix[i]);
        }
       

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // int rotated[][] =  rotate(arr);
         optimal_rotate(arr);

        System.out.println("Rotated Image");

        // for (int i = 0; i < rotated.length; i++) {

        //     for (int j = 0; j < rotated.length; j++) {
        //         System.out.print(rotated[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
