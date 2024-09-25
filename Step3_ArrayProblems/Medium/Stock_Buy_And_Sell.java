package Medium;

public class Stock_Buy_And_Sell {

    // BruteForce Approched
    public static int stock(int []arr){
       int  maxPro = 0;
        
        for(int i =0; i<arr.length; i++){

            for(int j = i+1; j < arr.length; j++){

                if(arr[j] > arr[i]){

                    maxPro = Math.max(arr[j] - arr[i] , maxPro);
                }
            }
        }
        return maxPro;
    }
    
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4};

        int result = stock(prices);
        System.out.println(result);

    }
}
