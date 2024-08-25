/*

 Input Format: N = 3
 Result: 

  A  
 ABA 
ABCBA

*/

public class Alpha_Hill_Pattern {
    
    public static void alpha_hill(int n){

        for(int i=0; i<n; i++){

            // printing space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            // printing the character

            char ch= 'A';
            int breakpoint = (2*i+1)/2;

            for(int j=1;j<= 2*i+1; j++){
                System.out.print(ch);

                if(j<= breakpoint)ch++;
                else ch--;
            }

            // printing space

            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        
        int n=5;
        alpha_hill(n);
    }
}
