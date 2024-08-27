/*
 Input Format: N = 3
Result: 
***
* *
***

*/


public class Hollow_Rectangle_Pattern {
    
    public static void HRP(int n){

        for(int i=1; i<=n;i++ ){
            System.out.println("* ");
        }
    }
    public static void main(String[] args) {
        int N = 3;
        HRP(N);
    }
}
