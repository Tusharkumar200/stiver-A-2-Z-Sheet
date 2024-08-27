/*
 Input Format: N = 3
Result: 
***
* *
***

*/


public class Hollow_Rectangle_Pattern {
    
    public static void HRP(int n){

        for(int i=0; i<n;i++ ){

            for(int j=0; j<n; j++){
                if( i==0 || j==0 || i==n-1 || j==n-1){

                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        HRP(N);
    }
}
