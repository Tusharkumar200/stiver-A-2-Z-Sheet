
class SelectionSortCode{

    public static void ssort(int n , int[] arr){

        for(int i=0; i<=n-2; i++){

            int min =i;
            for(int j =i; j<=n-2;i++){

                if(arr[j] <arr[min]) min = j;

            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            for(int k =0; k<=arr[i];k++){
                System.out.println(arr[k]);
            }
        }
        

    }

    public static void main(String[] args) {
        
        int n = 5;
        int arr[] = {90,50,70,1,8};
         ssort(n , arr);



    }
}