/*
 Sample Input 1:
3
Sample Output 1:
1 
2 2 
3 3 3
*/

public class printingTriangle {
    public static void triangleprint(int n){
        for(int row = 1; row <= n; row++){

            for(int col =1; col<=row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        int n = 5;
        triangleprint(n);
    }
}
