/*Input Format: N = 3
Result: 
A
A B
A B C

*/

public class Increasing_Letter_Triangle_Pattern {
    public static void ILTP(int n){


        for(int i =0; i< n;i++){

            for(char c='A'; c<= 'A'+i; c++){
                System.out.print(c +" ");

                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n =5;
        ILTP(n);
    }
}
