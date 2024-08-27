
/*
 Input Format: N = 3
Result: 
*    *
**  **
******
**  **
*    *

 */


public class Symmetric_Butterfly_Pattern {
   
    public static void SBP(int n){

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
         
        int n=3;
        SBP(n);
        
    }    
}
