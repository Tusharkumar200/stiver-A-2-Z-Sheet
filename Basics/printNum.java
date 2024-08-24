/*
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 */

public class printNum {

    public static void printNumStar(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<row;col++){
                System.out.print(col+" ");
            }
            // System.out.println(row);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumStar(4);
    }
}
