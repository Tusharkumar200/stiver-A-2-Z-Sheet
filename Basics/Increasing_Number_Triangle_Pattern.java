
/*
Input Format: N = 3
Result: 
1
2 3
4 5 6

*/

public class Increasing_Number_Triangle_Pattern {
    
    public static void INTP(int num){

        int N =1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(N+" ");
                N= N+1;
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Increasing Number Triangle Pattern");

        int num = 5;
        INTP(num);
    }
}
