public class Left_Rotate_an_Array_by_One {
    
    public static void rotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i=0; i<n;i++){
            System.out.print(arr[i] +" ");
        }

        for(int j =1; j<n-1; j++){
            arr[n-1] = temp;

            
        }
        System.out.println("Rotate array :");
        for( int k: arr){
            System.out.print(k +" ");
        }

    }

    public static void main(String[] args) {
        
        int[]arr = {1,2,3,4,5};
        rotate(arr);
    }
}
