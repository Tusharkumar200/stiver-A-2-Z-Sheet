
/* 
Input Format: N = 3
Result: 
A B C
A B
A

*/


public class Reverse_Letter_Triangle_Pattern {
    public static void RLTP(int N){

        char alpha = 'A';
        for(int i =0; i<N; i++){

            for(char ch= 'A'; ch<= alpha +(N-i-1) ; ch++){
                System.out.print(ch + " ");
                
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int N = 3;
        RLTP(N);
    }
}
