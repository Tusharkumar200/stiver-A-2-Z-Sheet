public class Number_of_NGEs_to_the_right {
    
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        
    }
    public static void main(String[] args) {
         int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices = {0, 5};
        int[] result = count_NGEs(arr.length, arr, indices.length, indices);
        for (int res : result) {
            System.out.println(res);
        }
    }
}
