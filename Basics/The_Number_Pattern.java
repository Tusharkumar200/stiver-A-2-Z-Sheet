/*
 
 */


public class The_Number_Pattern {

    public static void TNP(int n){

        int a = 2 * n-1;

        for(int i= 0; i < a; i++){

            for(int j=0; j<a ; j++){
                
                int top =i;
                int bottom = j;
                int right = (2*n-2)-j;
                int left = (2*n-2)-i;

                System.out.print(n -Math.min(Math.min(top, bottom) , Math.min(left , right) ) +" ");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        
        int n= 3;
        TNP(n);
    }
}
