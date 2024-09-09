public class reverse_an_array {
    
    public static void main(String[] args) {

        
        int arr[] = {50,40,30,20,10};
        int arrsize = arr.length-1;
        

        // for(int i=0;i<= arr.length ; i++){
        //     System.out.println(arr[i]);

        // }

        for(int i = arrsize; i>=0; i--){
            System.out.println(arr[i] +" ");
        }
    }
}
