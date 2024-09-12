
public class insertionsort {

    public static void sort(int[] arr){

        int temp;
        int j=0;

        for(int i=0; i<=arr.length;i++){
            temp=arr[i];
            j=i;
            while(j > 0 && temp < arr[j-1] ){

                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void printArray(int arr[]){
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {50,80,10,20,30,6,5};
        sort(arr);
        printArray(arr);
    }    
}
