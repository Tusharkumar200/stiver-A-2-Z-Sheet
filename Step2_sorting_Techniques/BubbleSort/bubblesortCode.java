public class bubblesortCode {
    
    public static void code(int[] arr){

        for(int i=0; i<=arr.length; i++){

            for(int j=i+1; j<arr.length;j++){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[]arr){

        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args){

        int arr[]={82,40,60,98,78,25};
        code(arr);
        printArray(arr);
    }
}
