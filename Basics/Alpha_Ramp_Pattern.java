/*
Input Format: N = 3
Result: 
A
B B
C C C
 */

public class Alpha_Ramp_Pattern {
    
    public static void ARP(int n){

        char alpha = 'A';
        for(int i =0; i<n; i++){

            for(int  ch =0 ; ch<=i; ch++){
                System.out.print(alpha + " ");
            }
            alpha++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int n = 3;
        ARP(n);
    }

}
