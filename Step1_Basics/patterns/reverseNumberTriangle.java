/*
 Sample Input 1 :
4
Sample Output 1 :
1 2 3 4
1 2 3
1 2
1

 */

public class reverseNumberTriangle {
    public static void printNumber(int n){
        for(int i =0; i<n; i++){
            for(int j = n; j>i ;j--){
                System.out.print(n-j+1);
            
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int N = 4;
        printNumber(N);
    }
}
