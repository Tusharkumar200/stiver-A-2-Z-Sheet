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
    

    // optimal Approched:

    public static int fastStock(int[] arr){

        int maxProfit =0;
        int minPrice = Integer.MAX_VALUE;
        for(int i :arr){

            if(i < minPrice){
                minPrice = i;
            }
            else if(i - minPrice > maxProfit){
                maxProfit = i - minPrice;
            }
          
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        
        // int prices[] = {7,1,5,3,6,4};
        int prices[] = {7,6,5,4,3,2,1};

        // int result = stock(prices);
        int result = fastStock(prices);

        System.out.println(result);

    }
}
